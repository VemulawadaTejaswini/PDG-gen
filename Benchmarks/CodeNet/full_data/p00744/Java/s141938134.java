import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//get the number of blue cards
			int bnum = sc.nextInt();
			//get the number of red cards
			int rnum = sc.nextInt();
			if(bnum == 0 && rnum == 0){
				break;
			}

			//reading data
			int[] bmap = new int[bnum];
			int[] rmap = new int[rnum];
			for(int i = 0; i < bmap.length; i++){
				bmap[i] = sc.nextInt();
			}
			for(int i = 0; i < rmap.length; i++){
				rmap[i] = sc.nextInt();
			}
	
			//connection con[blue card] = red card
			int[] con = new int[bnum];
			Arrays.fill(con, -1);
			
			//search
			int res = 0;
			for(int i = 0; i < bmap.length; i++){
				if(isMatch(i, bmap, rmap, con, null)){
					res++;
				}					
			}

			System.out.println(res);
		}
	}

	//spos = blue card No.
	//smap = blue cards data
	//emap = red cards data
	//stoe = connections
	//excepstoe = list of already searched blue-red connections
	static boolean isMatch(int spos, int[] smap, int[] emap, int[] stoe, boolean[][] excepstoe){
		boolean res = false;
		if(excepstoe == null){
			excepstoe = new boolean[smap.length][emap.length];
		}

		//loop in red cards
		for(int i = 0; i < emap.length; i++){
			//if blue(No. = spos) and red(No. = i) can make pair and red(No. = i) is not fixed 
			if(euclid(smap[spos], emap[i]) != 1 && !excepstoe[spos][i]){
				//if red card No.i has not been used
				if(!isExist(i, stoe)){
					//then connect and end function
					res = true;
					stoe[spos] = i;
					break;
				}else{
					//if red card has been occupied
					//then reconnect it to blue(No. = spos)
					//and let blue card which used to make pair with red(No. = i) find new pair
					//rewrite the connections map
					int exstoe = stoe[spos];
					stoe[spos] = i;

					//mark the connection blue card (No. spos) to red card (No. i)
					//so as not to search repeatedly
					excepstoe[spos][i] = true;
					
					//find new pair
					excepstoe[spos][i] = true;
					if(isMatch(findpos(i, stoe), smap, emap, stoe, excepstoe)){
						//if new pair found
						//then save the connections and end function
						res = true;
						break;
					}else{
						//restore the stoe(connections map)
						stoe[spos] = exstoe;
					}
				}
			}
		}

		return res;
	}

	//whether the two cards can make pair
	static int euclid(int e1, int e2){
		int a = Math.min(e1, e2);
		int b = Math.max(e1, e2);

		int r = b % a;
		if(r != 0){
			return euclid(a, r);
		}else{
			return a;
		}
	}

	static boolean isExist(int v, int[] arr){
		boolean res = false;
		if (arr == null){
			return false;
		}

		for(int e : arr){
			if(v == e){
				res = true;
				break;
			}
		}
		return res;
	}

	static int findpos(int v, int[] arr){
		int res = -1;
		for(int i = 0; i < arr.length; i++){
			if (v == arr[i]){
				res = i;
				break;
			}
		}
		
		return res;
	}
}
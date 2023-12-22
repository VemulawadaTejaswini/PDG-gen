import java.util.*;

public class Main {
	
	private static ArrayList<Integer> xs;
	
	public static void main(String args[]){
		Scanner scr = new Scanner(System.in);
		int t = Integer.parseInt(scr.nextLine());
		for(int step=0; step<t; step++){
		    try{
				String[] str = scr.nextLine().split(" ", 0);
				int n = Integer.parseInt(str[0]);
				int k = Integer.parseInt(str[1]);
				xs = new ArrayList<Integer>();
				String[] strs = scr.nextLine().split(" ", 0);
				for(int i=0; i<n; i++){
					xs.add(Integer.parseInt(strs[i]));
				}
				if (n==0 && k==0) break; //??\?????????
				
				Starter(k);
			}catch(Exception e){
				System.err.println("TyialException");
				break;
			}
        }
		scr.close();
	}
	private static int[][] memo; // memo[k][start] <- start??\????????????????????§?????????
	private static void Starter(int k){
		memo = new int[k][xs.size()];
		for(int i=0; i<k; i++){
			for(int j=0; j<xs.size(); j++){
				memo[i][j] = Integer.MAX_VALUE;
			}
		}
		System.out.println( SetDinamo(k, 0) );
	}
	private static int SetDinamo(int k, int start){ //start??\???????¨????
		if(start>=xs.size()){	//NO_HOUSE
			return 0;
		}else if(memo[k-1][start] != Integer.MAX_VALUE){	//?????¢
			return memo[k-1][start];
		}else if(k==1){	//LAST_DINAMO
			memo[k-1][start] = xs.get(xs.size()-1) - xs.get(start);
			return memo[k-1][start];
		}else{
			for(int i=start; i<xs.size(); i++){
				int firlen = xs.get(i) - xs.get(start);
				int reslen = SetDinamo(k-1, i+1);
				memo[k-1][start] = (memo[k-1][start] <= firlen + reslen) ?
						memo[k-1][start] : firlen + reslen;
			}
			return memo[k-1][start];
		}
	}	
	/*private static int SetDinamo(int k, ArrayList<Integer> xs){
		if(xs.size()==0 || k==0) return 0;
		int mlen = Integer.MAX_VALUE;
		//int tlen = Integer.MAX_VALUE;
		int n = xs.size();
		System.out.println(n);
		int a = xs.get(n-1);
		xs.remove(xs.size()-1);
		for(int i=n-2; i>=0; i--){
			System.out.println(k+":"+i);
			int u = xs.get(i);
			xs.remove(i);
			int t = SetDinamo(k-1, xs);
			if(a-u+t<mlen) mlen = a-u+t;
		}
	    return mlen;
	}
	private static int SetDinamo(int k, ArrayList<Integer> xs){
		//System.out.print("Input:" + k + ":" + xs);
		if(xs.size()==0 || k==1){
			if(xs.size()==0){
				//.out.print("No_House ");
				return 0;
			}else{
				//System.out.print("No_Dinamo ");
				return xs.get(xs.size()-1) - xs.get(0);
			}
		}else{
			int minlen = Integer.MAX_VALUE;
			int n = xs.size();
			for(int i=0; i<n; i++){
				int firlen = xs.get(i) - xs.get(0);
				//System.out.print(" fir:" + firlen + " ");
				ArrayList<Integer> xsp = new ArrayList<Integer>();
				for(int j=i+1; j<n; j++){
					xsp.add(xs.get(j));
				}
				int reslen = SetDinamo(k-1, xsp);
				//System.out.print(" res:" + reslen);
				int sumlen = firlen + reslen;
				//System.out.println(" sum:" + sumlen);
				if(minlen > sumlen) minlen = sumlen;
			}
			//System.out.println(" min:" + minlen);
			return minlen;
		}
	}*/
}
import java.util.ArrayList;
import java.util.Scanner;
class Main{

	
	static char[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力



		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] strs = new String[h];
		for(int i = 0;i < h;i++){
			strs[i] = sc.next();
		}
		map = new char[h][w];
		for(int i = 0;i < h;i++){
			String str = strs[i];
			for(int j = 0;j < w;j++){
				map[i][j] = str.charAt(j);
			}
 		}
//		
//		for(int i = 0;i < h;i++){
//			for(int j = 0;j < w;j++){
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		
		int[][] rdp = new int[h][w];
		for(int i = 0;i < h;i++){				//横方向のdp
			for(int j = 0;j < w;j++){
				if(j == 0){
					if(map[i][j] == '#'){
						rdp[i][j] = 0;
					}else{
						rdp[i][j] = rsearch(i,j);
					}
				}else{
					if(map[i][j] == '#'){
						rdp[i][j] = 0;
					}else if(rdp[i][j-1] != 0){			//1個前が0じゃないなら同じ
						rdp[i][j] = rdp[i][j-1];
					}else{
						rdp[i][j] = rsearch(i,j);
					}
				}
			}
		}
		
//		for(int i = 0;i < h;i++){
//			for(int j = 0;j < w;j++){
//				System.out.print(rdp[i][j]);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();

		int[][] cdp = new int[h][w];
		
		for(int i = 0;i < h;i++){				//たて方向のdp
			for(int j = 0;j < w;j++){
				if(i == 0){
					if(map[i][j] == '#'){
						cdp[i][j] = 0;
					}else{
						cdp[i][j] = csearch(i,j);
					}
				}else{
					if(map[i][j] == '#'){
						cdp[i][j] = 0;
					}else if(cdp[i-1][j] != 0){			//1個前が0じゃないなら同じ
						cdp[i][j] = cdp[i-1][j];
					}else{
						cdp[i][j] = csearch(i,j);
					}
				}
			}
		}
		

//		for(int i = 0;i < h;i++){
//			for(int j = 0;j < w;j++){
//				System.out.print(cdp[i][j]);
//			}
//			System.out.println();
//		}

		int ans = 0;
		for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
				if(rdp[i][j] + cdp[i][j]-1 > ans){
					ans = rdp[i][j] + cdp[i][j]-1;
				}
			}
		}
		System.out.println(ans);

	}
	
	static int rsearch(int y,int x){
		
		int count = 0;
		while(x < map[0].length && map[y][x] != '#'){
			count++;
			x++;
		}
		return count;	
		
	}

	static int csearch(int y,int x){
		
		int count = 0;
		while(y < map.length && map[y][x] != '#'){
			count++;
			y++;
		}
		return count;	
	}


	static boolean checkswitch(int bit,int[] k,ArrayList<ArrayList<Integer>> list,int[] p,int m){

		//		System.out.println("bit " + bit);

		for(int i = 0;i < m;i++){

			ArrayList<Integer> sub = list.get(i);
			int onnum = 0;						//onの数
			for(int j = 0;j < sub.size();j++){
				//				System.out.println("sub "+ sub.get(j));
				if((bit & (1 << sub.get(j))) != 0){				//目的のスイッチがついているか
					onnum++;
					//					System.out.println("on  ");
				}

			}
			if(onnum % 2 != p[i]){				//一個でも電球がつかなかったらout
				return false;
			}

		}


		return true;

	}

	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  otherpair.end - end;
	}
}



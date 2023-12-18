import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static long mod = 1000000007;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);

		int c = 0;
		int oc = 0;
		int mode = 0;



		for(int i = 0;i < sb.length();i++){
//			System.out.println("i " + i + " mode "+ mode);			

			if(mode == 0){							//modeの確定
				if(sb.charAt(i) == ')'){
					mode = 1;
				}else{
					mode = 2;
				}
			}


			if(mode == 1){					
				if(sb.charAt(i) == ')'){
					c++;

				}else{
					for(int j = 0;j < c;j++){
						sb.insert(0,"(");
					}
					i += c-1;
					mode = 0;
					c= 0;

				}

			}else if(mode == 2){
				if(sb.charAt(i) == '('){
					oc++;
				}else{
					oc--;
				}

				if(oc == 0){
					mode = 0;
				}
			}


			//			System.out.println(" mode "+ mode);			
			//			System.out.println();			
		}



		if(c>0){							//"("が多い時後ろに")"をつける
			for(int i = 0;i < c;i++){
				sb.insert(0,"(");
			}
		}

		if(oc>0){							//"("が多い時後ろに")"をつける
			for(int i = 0;i < oc;i++){
				sb.append(")");
			}
		}
		String ans = new String(sb);

		System.out.println(ans);







	}
	static int lowerbond(int k, int[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data[max];
	}


	static long cal(int n){
		long x = (long)n;
		for(int i = n-1;i > 0;i--){
			//	System.out.println(i);
			x *= i;
			x %= mod;
		}
		return x;
	}

}



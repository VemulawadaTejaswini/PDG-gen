import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}

		long sumx  = 0;
		long sumy  = 0;

		long ansx  = 0;
		long ansy  = 0;



		for(int i = 0;i < n;i++){					//偶数番目で正
			if(i % 2 == 0){
				if(sumx + a[i] > 0){
					sumx += a[i];
				}else{
					ansx += 1 + Math.abs(sumx + a[i]);			//カウントを増やす
					sumx = 1;
				}
			}else{
				if(sumx + a[i] < 0){
					sumx += a[i];
				}else{
					ansx += 1 + Math.abs(sumx + a[i]);			//カウントを増やす
					sumx = -1;
				}
			}

		}
		for(int i = 0;i < n;i++){					//偶数番目で負
			if(i % 2 == 0){
				if(sumy + a[i] < 0){
					sumy += a[i];
				}else{
					ansy += 1 + Math.abs(sumy + a[i]);			//カウントを増やす
					sumy = -1;
				}
			}else{
				if(sumy + a[i] > 0){
					sumy += a[i];
				}else{
					ansy += 1 + Math.abs(sumy + a[i]);			//カウントを増やす
					sumy = 1;
				}

			}
		}

			System.out.println(Math.min(ansx, ansy));




		}

	}

	class Pair implements Comparable{
		Character from;
		int end;
		@Override
		public int compareTo(Object other) {
			Pair otherpair = (Pair)other;

			return end - otherpair.end;
		}
	}



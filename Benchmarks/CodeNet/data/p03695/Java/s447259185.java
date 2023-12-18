import java.util.*;

class Main{

	static int[] cmin = new int[8];
	static int[] cmax = new int[8];


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];


		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		for (int j=0; j<8; j++){
			cmin[j] = 0;
			cmax[j] = 0;
		}

		for (int i=0; i<n; i++){
			col(a[i]);
		}

		int min = 0;
		int max = 0;
		for (int j=0; j<8; j++){
			if (cmin[j] != 0){
				min++;
			}
			if (cmax[j] != 0){
				max++;
			}
		}

		System.out.println(min +" "+max);
	}

		public static void col(int rate){
			if (rate >= 1 && rate <=399){
				cmin[0]++;
				cmax[0]++;
			}
			else if (rate >= 400 && rate <= 799){
				cmin[1]++;
				cmax[1]++;
			}
			else if (rate >= 800 && rate <= 1199){
				cmin[2]++;
				cmax[2]++;
			}
			else if (rate >= 1200 && rate <= 1599){
				cmin[3]++;
				cmax[3]++;
			}
			else if (rate >= 1600 && rate <= 1999){
				cmin[4]++;
				cmax[4]++;
			}
			else if (rate >= 2000 && rate <= 2399){
				cmin[5]++;
				cmax[5]++;
			}
			else if (rate >= 2400 && rate <= 2799){
				cmin[6]++;
				cmax[6]++;
			}
			else if (rate >= 2800 && rate <= 3199){
				cmin[7]++;
				cmax[7]++;
			}
			else if (rate >= 3200){
				int min = 101;
				int point = 100;
				for (int j=0; j<8; j++){
					if (cmax[j] <= min){
						min = cmax[j];
						point = j;
					}
				}
				cmax[point]++;
			}
		}


	
}
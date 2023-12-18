import java.util.*;

public class Main{

	static int[] cmin = new int[8];
	static int min = 0;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];


		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		for (int j=0; j<8; j++){
			cmin[j] = 0;
		}

		int check = 0;
		for (int i=0; i<n; i++){
			if (a[i] < 3200){
				col(a[i]);				
				check++;
			}
		}

		int pro = 0;
		for (int i=0; i<n; i++){
			if (a[i] >= 3200){
				pro++;
			}
		}
		if (check != 0){
			for (int j=0; j<8; j++){
				if (cmin[j] != 0){
					min++;
				}
			}
			System.out.println(min +" "+(min+pro));
		}
		else{
			System.out.println("1 "+pro);
		}

	}

	public static void col(int rate){
		if (rate >= 1 && rate <=399){
			cmin[0]++;
		}
		else if (rate >= 400 && rate <= 799){
			cmin[1]++;
		}
		else if (rate >= 800 && rate <= 1199){
			cmin[2]++;
		}
		else if (rate >= 1200 && rate <= 1599){
			cmin[3]++;
		}
		else if (rate >= 1600 && rate <= 1999){
			cmin[4]++;
		}
		else if (rate >= 2000 && rate <= 2399){
			cmin[5]++;
		}
		else if (rate >= 2400 && rate <= 2799){
			cmin[6]++;
		}
		else if (rate >= 2800 && rate <= 3199){
			cmin[7]++;
		}

	}
}
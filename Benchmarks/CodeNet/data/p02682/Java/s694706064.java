import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();

		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);

		// int one[]=new int[a];
		// int zero[]=new int[b];
		// int minus[]=new int[c];
		int anser = 0;

		int k1 = 0;
		int k2 = 0;
		//int k3 = 0;

		if(k>a || k==a){
		for(int i=0; i<a; i++){
			anser++;
		}
		k1 = k-a;
	}else if(a>k){
		for(int i=0; i<k; i++){
			anser++;
		}
		k1 = 0;
	}

		if(k1>b || k1==b){
		for(int i=0; i<b; i++){
			anser = anser + 0;
		}
		k2 = k1-b;
	}
		for(int i=0; i<k2; i++){
			anser =anser -1;
	}
		System.out.println(anser);
	}
}
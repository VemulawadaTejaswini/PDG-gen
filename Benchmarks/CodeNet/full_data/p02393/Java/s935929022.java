import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bufa;
		int[] a = new int[3];
		for(int i:a){
			i = sc.nextInt();
		}
		if(a[0]>a[1]){
			bufa = a[1];
			a[1] = a[0];
			a[0] = bufa;
		}
		if(a[1]>a[2]){
			bufa = a[2];
			a[2] = a[1];
			a[1] = bufa;
		}
		if(a[0]>a[1]){
			bufa = a[1];
			a[1] = a[0];
			a[0] = bufa;
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}
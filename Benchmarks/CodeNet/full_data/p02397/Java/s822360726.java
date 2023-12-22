import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3000];
		int[] b = new int[3000];

		for(int i = 0 ; i<3000 ; i++){
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
			if(a[i]==0&& b[i]==0) break;
		}

		for(int i = 0 ; i<3000 ; i++){
			if(a[i]==0&& b[i]==0) break;
			if(a[i]>b[i])swap(a,b,i);
			System.out.println(a[i]+" "+b[i]);
		}
	}

	static void swap(int[] a,int[] b,int i){
		int tmp =a[i];
		a[i]=b[i];
		b[i]=tmp;
		return;
	}

}
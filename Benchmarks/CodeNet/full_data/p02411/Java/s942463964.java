import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =0;
		int[]a = new int[50];
		int[]b = new int[50];
		int[]c = new int[50];
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1) {
				break; }
				a[i]=m;
				b[i]=f;
				c[i++]=r;
			}
			for (int j =0; j<i; j++){
				if(a[j] == -1 || b[j] == -1){
					System.out.println("F");
				} else if(a[j]+b[j]>=80){
					System.out.println("A");
				} else if(a[j]+b[j]>=65){
					System.out.println("B");
				} else if(a[j]+b[j]>=50){
					System.out.println("C");
				} else if(a[j]+b[j]>=30){
					if(c[j]>=50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else {
		System.out.println("F");
	}
}}}

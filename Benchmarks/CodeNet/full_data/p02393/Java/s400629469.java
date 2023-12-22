import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		int kari=0;
		for(int i=2;i>0;i--) {
			if(a[i]<a[i-1]) {
				kari=a[i];
				a[i]=a[i-1];
				a[i-1]=kari;
			}
		}
		for(int i=0;i<3;i++) {
			System.out.printf(a[i]+"");
			if(i==3) {
				System.out.println("");
			}else {
				System.out.printf(" ");
			}
		}
	}
}


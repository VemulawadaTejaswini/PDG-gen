import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = {0,0,0};
		for(int i = 0; i < 10; i++){
			a[i]=sc.nextInt();
		}
		for(int i = 0; i < 10; i++){
			if(a[i]>b[0]){
				b[1]=b[2];
				b[0]=b[1];
				b[0]=a[i];
			}
			else if(a[i]>b[1]){
				b[1]=b[2];
				b[1]=a[i];
			}
			else if(a[i]>b[2])
				b[2]=a[i];
		}
		for(int i = 0; i < 3; i++)
			System.out.println(b[i]);
	}
}
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] aa=new int[n];
		int[] bb = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			aa[i]=a;
			bb[i]=b;
		}
		for(int i = 0; i<n; i++){
			sum+=bb[i];
			if(sum>=k){
				System.out.println(aa[i]);
				return;
			}
		}
	}
}
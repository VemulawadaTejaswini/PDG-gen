import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int[] a=new int[n*2];
			for(int i=0;i<a.length;i++){
				a[i]=in.nextInt();
			}
			Arrays.sort(a);
			int sum=0;
			for(int i=0;i<a.length;i+=2){
				sum+=a[i];
			}
			System.out.println(sum);
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int[] a;
		a = new int[n];
		long t = 0;
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(as.next());
			t+=a[i]-1;
		}
		if(t%2==1){
			System.out.println("First");
		}else{
			System.out.println("Second");
		}
	}
}
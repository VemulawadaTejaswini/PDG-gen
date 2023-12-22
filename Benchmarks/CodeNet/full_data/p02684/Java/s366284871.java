import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long h = k%n;
		//System.out.println(h);
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
		}
		int a = arr[n];

		int b =0;
		while(h+1>0){
			//System.out.println("anuj");
			b = arr[a];
			//System.out.println(b);
			a=b;
			h--;
		}
		System.out.println(b);

	}
}
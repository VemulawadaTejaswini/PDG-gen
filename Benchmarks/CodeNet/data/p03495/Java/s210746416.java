import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());scan.nextLine();
		int[] a = new int [n];
		Arrays.fill(a, 0);
		for (int i = 0;i < n;++i){
			++a[Integer.parseInt(scan.next())-1];
		}

		Arrays.sort(a);
		int rem=0;
		int i;
		for (i = 0;i < n;  ++i){
			if (a[i] != 0)break;
		}
		int ans=0;
		for (int j = i;j < (n-i)-k+i; ++j){
			ans+=a[j];
		}
		System.out.print(ans);


	}
}
//end

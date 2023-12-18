import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		int[] a =new int[n];
		for (int i = 0; i < n;++i){
			a[i]=Integer.parseInt(scan.next());
		}
		if (n>k){
			System.out.println(n/(k-1));
		}else{
			System.out.print(1);
		}


}
}
//end
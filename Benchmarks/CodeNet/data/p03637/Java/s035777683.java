import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());scan.nextLine();
		int a;
		int count_2 = 0;
		int count_4 = 0;
		for (int i = 0;i < n; ++i){
			a = Integer.parseInt(scan.next());
			if (Math.log10(a)/Math.log10(2) >= 1)++count_2;
			if (Math.log10(a)/Math.log10(4) >= 1)++count_4;
		}
		if (count_4>=n/2 || count_2==n){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}


	}
}
//end

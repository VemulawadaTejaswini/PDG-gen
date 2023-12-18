import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());scan.nextLine();
		int a;
		int count_2 = 0;
		int count_4 = 0;
		int tmp;
		for (int i = 0;i < n; ++i){
			tmp =0;
			a = Integer.parseInt(scan.next());
			for (int k = 0;k < 2; ++k){
				if (a%2==0)++tmp;
				else break;
				a=a>>1;
			}
			if (tmp==2)++count_4;
			else if (tmp==1)++count_2;
		}
		if (count_4>=(n-(count_2/2)*2)/2 && count_2>=n-count_4*3){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}


	}
}
//end

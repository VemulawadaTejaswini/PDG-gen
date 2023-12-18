import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int countList[] = new int[n+1];
		int count = 0;

		for(int i=0;i<n-1;i++){
			String ss = s.substring(i,i+2);
			if(ss.equals("AC")){
				count++;
				countList[i+1]=count;
				// System.out.println(i + " "+count);
			}else{
				countList[i+1]=count;
				// System.out.println(i + " "+count);
			}
		}

		for(int i=0;i<q;i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int total = countList[r-1] -countList[l-1];
			// System.out.print(countList[r-1] + " ");
			// System.out.print(countList[l-1] + " ");
			System.out.println(total);
		}


 
	}
}

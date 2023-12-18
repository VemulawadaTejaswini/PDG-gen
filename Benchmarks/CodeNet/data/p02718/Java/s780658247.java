import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();	//商品の種類 n
        int m = scan.nextInt();	//M個
        int[] a;        //a[i] :Ai票
        a = new int[n];
		int count = 0;
		int total = 0;
		
        for (int i=0; i<n; i++) {
        	a[i] = scan.nextInt();
			total+=a[i];
        }

        for (int i=0; i<n; i++) {
			if(a[i]>=(total/4/m)){
				count++;
			}
        }
        
        // 得票数：総得票数（A1+...+AN）の1/4M以上の商品数 > M ならば "Yes"
        
		if (count>m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	    scan.close();	

    }
}
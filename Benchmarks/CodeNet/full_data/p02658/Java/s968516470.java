import java.util.Scanner;

public class Template {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
            int[] num = new int[n];
            int res = 1;
	        for(int i = 0; i<n; i++) {
              num[i]=sc.nextInt();
              res = res*num[i];
            }
          
	        if(res > Math.pow(10, 18) )
	        System.out.println("-1");
            else
            System.out.println(res); 
	}
}
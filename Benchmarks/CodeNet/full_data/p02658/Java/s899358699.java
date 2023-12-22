import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
            Long[] num = new Long[n];
            Long res = 1L;
            
            
	        for(int i = 0; i<n; i++) {
              num[i]=sc.nextLong();
              res = res*num[i];
            }
          
	        if(res > 1000000000000000000L) {
	        System.out.println("-1");
	        }else {
            System.out.println(res); 
	        }
	}
}
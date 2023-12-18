import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();
		
        if (n <= 9) {
            System.out.println("Yes");
        }
        else if ((n == 11)||(n>81)) {
            System.out.println("No");
        } else {
            boolean issosu = true;
            for (int u = 2; u < n; u++) {
                if (n % u == 0) {
                issosu = false;
                }
            }
            if (issosu) {
                System.out.println("No");
            } else {
                if(n % 13 == 0){
                   System.out.println("No"); 
                }else if(n % 17 == 0){
                    System.out.println("No");
                }else if(n % 19 == 0){
                    System.out.println("No");
                }else if(n % 23 == 0){
                    System.out.println("No");
                }else if(n % 29 == 0){
                    System.out.println("No");
                }else if(n % 31 == 0){
                    System.out.println("No");
                }else if(n % 37 == 0){
                    System.out.println("No");
                }else if(n % 11 == 0){
                    System.out.println("No");
                }else{
                System.out.println("Yes");
                }
            }
        }
    }
}
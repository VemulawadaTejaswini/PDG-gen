import java.util.*;

public class Main {
 	public static void main(String[] args) {
     	Scanner s = new Scanner(System.in);
      	int a = s.nextInt();
      	int b = s.nextInt();
      	if (b - a >= 2019) {
         	 System.out.println(0);
        } else {
         	if (b % 2019 == a % 2019 + 1) {
             	System.out.println(0); 
            } else {
             	System.out.println((a * (a + 1)) % 2019); 
            }
        }
    }
}
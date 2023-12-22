import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
        Long a = sn.nextLong();
      	Long b = sn.nextLong();
      	Long c = sn.nextLong();
      	Long d = sn.nextLong();
        Long max1 = (Long) a * c; 
      	Long max2 = (Long) a * d;
      	Long max3 = (Long) b * c;
      	Long max4 = (Long) b * d;
      	Long max11 = Math.max(max1, max2);
      	Long max22 = Math.max(max3, max4);
      	System.out.println(Math.max(max11, max22));
    }
}
 
import java.util.*;

public class Main{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int input1 = sc.nextInt();
     int input2 = sc.nextInt();
     
     if(input1 <= input2) {
      System.out.println("unsafe");
     } else {
      System.out.println("safe");
     }
     
    }
}
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
       	int result = (a*b)%2;
      	if (result == 0) {
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
    }
}
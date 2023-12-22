import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
      int intV = sc.nextInt();
      int intB = sc.nextInt();
      int intW = sc.nextInt();
      int intT = sc.nextInt();
      

      if (((intA + (intV * intT))-(intB + (intW * intV))) <= 0 ) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
 
    }
}
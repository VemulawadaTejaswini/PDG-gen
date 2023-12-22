import java.util.Arrays;
import java.util.Scanner;
 
  class Main {
 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
        int[] foo = {a, b, c};
         
        Arrays.sort(foo);
        
        System.out.println(foo[0] + " " + foo[1] + " " + foo[2]);
        scanner.close();
    }
 
}

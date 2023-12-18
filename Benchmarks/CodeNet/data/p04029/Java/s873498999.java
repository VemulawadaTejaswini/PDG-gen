import java.util.Scanner;

class Candy {
 public static void main(String[] args) {
     scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int sum = 0;
     for(int i = 0; i < n; i++) {
          sum += (i + 1);
     }
     System.out.println(sum);
   }
}
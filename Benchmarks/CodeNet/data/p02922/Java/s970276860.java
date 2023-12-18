    import java.util.*;
     
    public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 1;
        int count = 1; 
        
        for(int i = 0; sum < b; i++) {
          sum = sum + a - 1;
          count++;
        }
        System.out.println(count - 1);
      }
    }
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[k];

        String price = String.valueOf(n);
        for (int i = 0; i < k; i++) {
          list[i] = sc.nextInt();
          while (price.indexOf(String.valueOf(list[i])) > -1)){
            int index = price.indexOf(String.valueOf(list[i]));
            n += Math.pow(10, price.length() - index);
            price = String.valueOf(n);
          }
        }
      
      for (int i = 0; i < k; i++) {
        while (price.indexOf(String.valueOf(list[i]) > -1)){
            int index = price.indexOf(String.valueOf(list[i]));
            n += Math.pow(10, price.length() - index);
            price = String.valueOf(n);
        }
      }

        
        System.out.println(price);
    }
}

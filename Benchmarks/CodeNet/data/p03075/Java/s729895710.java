import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      
        int[] num = new int[5];
        for (int i=0; i<5; i++) {
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        String result = "Yay!";
        out: for (int i=0; i<5; i++) {
           for (int j=0; j<5; j++) {
              if (Math.abs(num[i] - num[j]) > 15) {
                  result = ":(";
                  break out;
              }
           }
        }

        System.out.println(result);
    }
}

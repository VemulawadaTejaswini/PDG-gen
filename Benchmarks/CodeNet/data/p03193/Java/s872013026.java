import java.util.*;


public class Main {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int count = 0;
           int h = sc.nextInt();
           int w = sc.nextInt();
           int[] he = new int[n];
           int[] wi = new int[n];
           for (int i = 0; i < n; i++) {
               he[i] = sc.nextInt();
               wi[i] = sc.nextInt();
               if (he[i] <=  h && wi[i] <= w) {
                   count++;
               }
           }
            System.out.println(count);

            sc.close();
        }
    
}


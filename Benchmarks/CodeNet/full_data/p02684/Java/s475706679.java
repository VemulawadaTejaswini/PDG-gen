import java.util.*;

public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
          
      int n = sc.nextInt();
      long k = sc.nextInt();
      
      int a[] = new int[n];
      
      for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
      }
      
      int nn[] = new int[n];
      
      for (int i = 0; i < n; i++) {
         nn[i] = 0;
      }
      
      int s = 1;
      
      int count = 0;
      
      ArrayList<Integer> b = new ArrayList<>();
      
      while (true) {
         if (nn[s - 1] == 1) {
            int rep = b.indexOf(s);
            int t = count - rep;
            if (k - rep < 0) {
               System.out.println(b.get((int)k));
               break;
            } else {
               int num = 0;
               if (t == 0) {
                  num = (int)k - rep;
               } else {
                  num = ((int)k - rep) % t;
               }
               System.out.println(b.get(rep + num));
               break;
            }
         } else {
            b.add(s);
            nn[s - 1] = 1;
            s = a[s - 1];
            count++;
         }
      }
   }
}
import java.util.*;
 
public class Main {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int count = 0;
     ArrayList<Integer> box = new ArrayList<>();
     for (int i = 0; i < n; i++) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         for(int j = 0; j < b; j++) {
            box.add(a);
            count ++;
             if(count > k -1) {
                 System.out.println(box.get(k - 1));
                 return;            
             }
         }
     }
     System.out.println(box.get(k - 1));
 }
}
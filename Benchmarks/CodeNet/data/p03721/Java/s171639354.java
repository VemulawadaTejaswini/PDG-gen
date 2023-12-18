import java.util.*;

public class Main {
 public static void main(Stirng args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     ArrayList<Integer> box = new ArrayList<>();
     for (int i = 0; i < n; i++) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         for(int j = 0; j < b; j++) {
            box.add(a);
         }
     }
     System.out.println(box.get(k - 1));
 }
}
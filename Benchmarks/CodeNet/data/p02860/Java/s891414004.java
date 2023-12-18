import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t;
      
        t = s.substring(n/2);
      	
      	if (t + t.equals(s)) {
          System.out.print("Yes");
        } else {
          System.out.print("No");
        }
    }
}
      	
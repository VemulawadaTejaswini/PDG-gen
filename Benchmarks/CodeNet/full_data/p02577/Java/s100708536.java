import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int d = N.length();
        int sum = 0;
        for (int i = 0; i < d; i++) {
            sum += Integer.parseInt(N.substring(i, i+1));
        }
      	if (sum % 9 == 0) {
        	System.out.println("Yes");
        } else {
          System.out.println("No");
        }

    }
}
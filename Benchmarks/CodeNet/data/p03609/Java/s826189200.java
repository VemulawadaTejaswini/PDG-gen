import java.util.*;

/**
 * Base_version with PrintWriter
 */ 

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int t = sc.nextInt();
      	PrintWriter out = new PrintWriter(System.out);
        out.println(Math.max(x - t, 0));
      	out.flush();
    }
}
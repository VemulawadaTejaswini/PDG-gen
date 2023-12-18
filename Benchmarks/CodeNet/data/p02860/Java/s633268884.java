import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scan_N = scan.next();
        String str = scan.next();
		scan.close();
        int N = Integer.parseInt(scan_N);
        if (str.substring(0,N/2).equals(str.substring(N/2,N))) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      
    }
}

import java.util.Scanner;
import java.lang.Integer;

class Main {
    public static void main(String[] args) throws NumberFormatException {
      	Scanner sc = new Scanner(System.in);
		var N = sc.nextInt();
        var K = sc.nextInt();
        String n = N;
        String k = K; 
        System.out.println(String.valueOf(Integer.parseInt(n, k)).length());
    }
}

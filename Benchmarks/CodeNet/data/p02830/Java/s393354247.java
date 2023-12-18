import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        for (int i=0;i<a.length();i++){
            System.out.print(a.substring(i,i+1) + b.substring(i,i+1));
        }
    }
}

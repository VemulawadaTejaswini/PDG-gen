import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input A B C
        // A = B not C || A = C not B || B = C not A
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String retStr = "No";
        if(a == b){
            if(a == c){
            } else {
                retStr = "Yes";
            }
        } else {
            if(a == c || b == c){
                retStr = "Yes";
            }
        }
        System.out.println(retStr);
    }
}

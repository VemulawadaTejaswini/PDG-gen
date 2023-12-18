import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.charAt(0) == s2.charAt(2) && s1.charAt(1) == s2.charAt(1) && s1.charAt(2) == s2.charAt(0)){
            out.println("YES");
        }else{
            out.println("NO");
        }
        out.flush();
    }
}
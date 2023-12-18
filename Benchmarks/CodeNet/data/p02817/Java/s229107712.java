import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
        String S,T;
        String s,t;
        Scanner scan = new Scanner(System.in);
        S = scan.nextLine();
        T = scan.nextLine();
        s = S.toLowerCase();
        t = T.toLowerCase();
        System.out.println(t+s);
    }
}
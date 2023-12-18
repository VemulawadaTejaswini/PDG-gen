import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String temp = sc.next();
        for(int i = 0 ; i < temp.length() ; i++){
            ans += "x";
        }
        System.out.println(ans);
    }
}
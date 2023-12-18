import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char c = S.charAt(0);
        boolean flg = false;
        for(int i = 1; i < S.length(); i++){
            if(S.charAt(i) == c){
                flg = true;
                break;
            }
            c = S.charAt(i);
        }
        System.out.println(flg ? "Bad" : "Good");
        
    }
}

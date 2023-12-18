import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String ans = "Good";
        char[] c = S.toCharArray();

        for(int i = 0; i < 3; i++){
            if(c[i] == c[i + 1]){
                ans = "Bad";
                break;
            }
        }
        System.out.print(ans);
    }
}
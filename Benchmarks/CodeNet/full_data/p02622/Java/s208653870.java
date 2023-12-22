import java.util.Scanner;
public class Main{

    public static void main(final String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int c = S.length();
        int cnt=0;
    for(int i=0; i<c; i++)
        if(S.charAt(i)!=T.charAt(i)){
            cnt++;
        }
    System.out.println(cnt);
    sc.close();

    }
}
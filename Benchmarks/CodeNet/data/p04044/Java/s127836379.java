import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();
        String chk;
        String str[] = new String[N];
        String ans = "";


        for(int i=0; i<N; i++){
            chk = scan.next();
            //文字列の長さの判定
            if(chk.length() == L){
                str[i] = chk;
            }else{
                System.out.println("error");
                i--;
            }

        }
        Arrays.sort(str);
        for(int i=0; i<N; i++){
            ans = ans + str[i];
        }
    System.out.println(ans);
    }
}

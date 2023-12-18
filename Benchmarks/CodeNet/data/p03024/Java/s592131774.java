import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if(S.length() <8){
            System.out.println("YES");
        }else{
            int lose =0;
            for (int i = 0; i < S.length(); i++) {
                if(S.charAt(i)=='x') lose++;
            }
            if(lose>=8){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }


    }
}

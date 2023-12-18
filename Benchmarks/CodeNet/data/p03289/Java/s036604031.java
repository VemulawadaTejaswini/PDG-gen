import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();
        boolean judge = false;

        if(S.charAt(0) != 'A')
            System.out.println("WA");
        else{
            if((S.charAt(1) >= 'A' && S.charAt(1) <= 'Z') || (S.charAt(S.length() - 1) >= 'A' && S.charAt(S.length() - 1) <= 'Z')){
                System.out.println("WA");
                return;
            }
            for(int i = 2; i < S.length() - 1; i++){
                if(S.charAt(i) == 'C'){
                    if(judge){
                        System.out.println("WA");
                        return;
                    }
                    else
                        judge = true;
                }
            }
            if(judge)
                System.out.println("AC");
            else
                System.out.println("WA");
        }
    }
}

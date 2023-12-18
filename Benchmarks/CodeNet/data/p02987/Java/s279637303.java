import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int miss = 0;

        for(int i = 0; i <= 3; i++){
            if(!(S.charAt(0) == S.charAt(i))){
                miss++;
            }

            if(i == 3) {
                if (miss >= 3) {
                    if(S.charAt(1) == S.charAt(2)){
                        System.out.println("Yes");
                        return;
                    }
                    System.out.println("No");
                    return;
                }else{
                    System.out.println("Yes");
                }
            }
        }


    }
}

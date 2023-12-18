import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        StringBuffer S1 = new StringBuffer(S);
        String S2 = S1.reverse().toString();
        int flag = 0;
        String error = "NO";
        int a = 0;

        String[] T = {"dream" ,"dreamer" ,"erase" ,"eraser"};

        for(int i = 0 ; i < T.length ; i++){
            StringBuffer T1 = new StringBuffer(T[i]);
            String T2 = T1.reverse().toString();
            T[i] = T2;
        }

        do{            
            for(int i = 0 ; i < T.length ; i++){     
                if(S2.length() >= T[i].length() && S2.substring(0,T[i].length()).equals(T[i])){

                    if(S2.length() == T[i].length()){
                        flag = 1;
                        error = "YES";
                        break;
                    }

                    else{
                        S2 = S2.substring((T[i].length()));
                        flag = 0;
                        break;
                    }
                }

                else{
                    flag = 1;
                    error = "NO";
                }
            }

        }while(flag == 0);

        System.out.println(error);
    }
}
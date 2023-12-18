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

        System.out.println(Arrays.toString(T));

        do{
            
            a = a + 1;
//            System.out.println(a);
            for(int i = 0 ; i < T.length ; i++){
                
                if(S2.length() >= T[i].length() && S2.substring(0,T[i].length()).equals(T[i])){
//                    System.out.println(S2.length());
//                    System.out.println(T[i].length());

                    if(S2.length() == T[i].length()){
//                        System.out.println(S2.length());
//                        System.out.println(T[i].length());
                        flag = 1;
                        error = "YES";
                        break;
                    }

                    else{
                        S2 = S2.substring((T[i].length()));
//                        System.out.println(S2);
                        flag = 0;
                        break;
                    }
                }

                else{
                    flag = 1;
                    error = "NO";
//                    System.out.println("MISS");
                }
            }

        }while(flag == 0);


        System.out.println(error);
    }
}
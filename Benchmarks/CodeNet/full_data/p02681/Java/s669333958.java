import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S, T; 

        S = sc.next();
        T = sc.next();

        if(T.length()-1 == S.length() && S.equals(T.substring(0,T.length() - 1))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
    
}
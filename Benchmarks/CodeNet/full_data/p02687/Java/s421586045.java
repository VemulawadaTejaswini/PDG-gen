import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String S = in.next();
        
        if(S.equals("ABC")){
            System.out.println("ARC");
        }else if(S == "ARC"){
            System.out.println("ABC");
        }
    }
}
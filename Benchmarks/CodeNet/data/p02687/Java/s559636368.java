import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = "ABC";

        if(S.equals(T)){
            System.out.println("ARC");
        }else{
            System.out.println("ABC");
        }

    }
}
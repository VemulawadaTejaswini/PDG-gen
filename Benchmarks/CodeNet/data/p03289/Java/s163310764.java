import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        boolean a = true;
        int c = 0;

        if (S.charAt(0)!='A') {
            a = false;
        }

        if (Character.isUpperCase(S.charAt(1))) {
            a = false;
        }
       
        for (int i = 2;i < S.length()-1;i++){
            if (Character.isUpperCase(S.charAt(i))) {
                if (S.charAt(i)=='C') {
                    c++;
                }else{
                    a = false;
                }
            }
        }

        if (Character.isUpperCase(S.charAt(S.length()-1))) {
            a = false;
        }

        if (a && c == 1) {
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}
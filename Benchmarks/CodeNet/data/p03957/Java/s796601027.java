import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String[] s = scan.next().split("");
        boolean firstc = false;
        boolean f = false;

        for (int i = 0; i < s.length; i++){
            if (s[i].equals("C") && !firstc){
                firstc = true;
            }else if (firstc && !f){
                f = true;
            }
        }

        if (f) System.out.println("Yes");
        else System.out.println("No");


    }
}


import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s2;
        for(int i = 0;i < s.length();i++){
            s2 = s.substring(i, i+1);
            if(s2.equals(s2.toUpperCase()))System.out.print(s2.toLowerCase());
            else System.out.print(s2.toUpperCase());
        }
        System.out.println();

        scan.close();
    }

    

}

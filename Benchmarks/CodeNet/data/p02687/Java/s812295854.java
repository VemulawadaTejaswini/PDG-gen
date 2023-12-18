import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s = new Scanner("ARC");

        String S = s.nextLine();
        if(S.equals("ABC")){
            System.out.println("ARC");
        }else {
            System.out.println("ABC");
        }
    }
}
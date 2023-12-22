import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        String s = stdIn.next();
        char[] cs = s.toCharArray();
        if(cs[s.length() - 1] == 's'){
            System.out.print(s);
            System.out.println("es");
        }else{
            System.out.print(s);
            System.out.println("s");
        }
    }
}
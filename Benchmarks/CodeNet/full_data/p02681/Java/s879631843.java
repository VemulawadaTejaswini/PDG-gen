import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        if(s.length() + 1 != t.length()){
            System.out.println("No");
            return;
        }
        if(!t.startsWith(s)){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
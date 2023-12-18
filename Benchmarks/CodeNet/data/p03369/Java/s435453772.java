import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            if(s.charAt(i) == 'o') sum+=100;
        }
        System.out.println(700+sum);
    }
}
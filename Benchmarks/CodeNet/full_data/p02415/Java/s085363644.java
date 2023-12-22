import java.util.Scanner;
import java.util.Formatter;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Formatter fm = new Formatter();
            String line = sc.nextLine();
            String answer = "";
            int length = line.length();
            for(int i=0;i<length;i++){
                char ch = line.charAt(i);
                char ch2;
                if(Character.isLowerCase(ch))ch2 = Character.toUpperCase(ch);
                else ch2 = Character.toLowerCase(ch);
                fm.format(answer+"%c",ch2);
            }
            System.out.println(fm);
        
    }
}


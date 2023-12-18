import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        for (int i = 0; i < str.length(); i++){
            result += str.charAt(i);
            if (result.charAt(result.length() - 1) == 'S' && str.charAt(i) == 'T'){
                result = result.substring(0, result.length()-1);
            }
        }
        System.out.println(result.length());
    }
}
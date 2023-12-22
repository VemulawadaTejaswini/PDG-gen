import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c += 'a' - 'A';
            }else if(c >= 'a' && c <= 'z'){
                c -= 'a' - 'A';
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String in = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        for(char c : in.toCharArray()){
            builder.append(Character.toChars(rot13(c,n)));
        }
        System.out.println(builder.toString());
    }

    private static int rot13(int c,int n){
        if ((c >= 'A') && (c <= 'Z'))
            c=(((c-'A') + n) % 26)+'A';
        if ((c >= 'a') && (c <= 'z') )
            c=(((c-'a') + n) % 26)+'a';
        return c;
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            sb.append( word.charAt( ((word.indexOf(c)+i) % word.length() ) ) );
        }
        System.out.println(sb);
    }
}

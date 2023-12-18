import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder buf = new StringBuilder();
        for(int i = 1; i < N; i++) {
            buf.append(sc.next());
        }
        String str = buf.toString();
        int len = str.length();
        int ans = 0;
        String s = "";
        String tmp = "";
        for(int j = 0; j < N; j++) {
            s = String.valueOf(j + 1);
            tmp = str;
            tmp = tmp.replace(s, "");
            System.out.println(len - tmp.length());
        }
    }
}
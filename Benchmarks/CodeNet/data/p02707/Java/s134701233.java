import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder buf = new StringBuilder();
        String str = "";
        for(int i = 1; i < N; i++) {
            str = sc.next();
            buf.append(str);
        }
        str = buf.toString();
        int len = str.length();
        String s = "";
        String tmp = "";
        int k = 1;
        do {
            s = String.valueOf(k);
            tmp = str;
            tmp = tmp.replace(s, "");
            System.out.println(len - tmp.length());
            k++;
        } while(tmp.length() > 0);
        while(k <= N) {
            System.out.println("0");
            k++;
        }
    }
}

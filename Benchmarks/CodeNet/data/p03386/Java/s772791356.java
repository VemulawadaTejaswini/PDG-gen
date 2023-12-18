import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String[] strs = sc.nextLine().split(" ");
                int a = Integer.parseInt(strs[0]);
                int b = Integer.parseInt(strs[1]);
                int k = Integer.parseInt(strs[2]);
                String r = "";
                int aup = (a+k < b)? a+k - 1 : b;
                int bdw = (b - k + 1 > aup)?b - k + 1 : aup + 1;
                for(int i=a; i<=aup; i++){
                    r += i+"\n";
                }
                for(int i=bdw; i<=b; i++){
                    r += i+"\n";
                }
                System.out.print(r);
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int X = Math.min(N,M);
        int count = Math.max(N,M);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count;i++){
            sb.append(X);
        }
        System.out.println(sb);
    }
}

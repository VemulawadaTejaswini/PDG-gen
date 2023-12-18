import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        // 標準入力の取得
        int N = Integer.parseInt(scan.next());

        // List<String> W = new ArrayList<String>(N);
        String[] W = new String[N];
        for (int i = 0; i < N; i++) {
            // W.add(scan.next());
            W[i] = scan.next();
        }

        // 重複チェック
        Set<String> Wst = new HashSet<String>(Arrays.asList(W));
        if(!(Wst.size() == N)){
            System.out.println("No");
            return ;
        }
        
        // しりとりできてるかチェック
        for (int i = 0; i < N-1; i++) {
            if(W[i].charAt(W[i].length() - 1) != W[i+1].charAt(0)){
                System.out.println("No");
                return ; 
            }
        }
        System.out.println("Yes");
        return ; 
    }
}

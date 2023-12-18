import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        // 標準入力の取得
        int N = Integer.parseInt(scan.next());

        String[] W = new String[N];
        for (int i = 0; i < N; i++) {
            W[i] = scan.next();
        }
        scan.close();

        // 重複チェック
        Set<String> Wst = new HashSet<String>(Arrays.asList(W));
        if(!(Wst.size() == W.size())){
            System.out.println("No");
            return ;
        }
        
        // しりとりできてるかチェック
        for (int i = 0; i < N-1; i++) {
            if(W.get(i).charAt(W.get(i).length() - 1) != W.get(i+1).charAt(0)){
                System.out.println("No");
                return ; 
            }
        }
        System.out.println("Yes");
        return ; 
    }
}

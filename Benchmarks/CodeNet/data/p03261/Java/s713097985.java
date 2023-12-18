import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        // 標準入力の取得
        int N = Integer.parseInt(scan.next());

        List<String> W = new ArrayList<String>(N);
        for (int i = 0; i < N; i++) {
            W.add(scan.next());
        }

        // 重複チェック
        Set<String> Wst = new HashSet<String>(W);
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

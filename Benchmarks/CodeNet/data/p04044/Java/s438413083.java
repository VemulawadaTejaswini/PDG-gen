import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] S = new String[N]; 
        
        //文字列を格納し、辞書順に並び替え
        for(int i = 0; i < N; i++)S[i] = sc.next();
        Arrays.sort(S);

        for(int i = 0; i < N; i++)System.out.print(S[i]);
    }
}

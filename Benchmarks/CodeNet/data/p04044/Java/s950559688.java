import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> S = new ArrayList<>();

        System.out.println("文字の長さは?");
        int L = sc.nextInt();
        System.out.println("文字列の数は?");
        int N = sc.nextInt();
        String s;

        for(int i = 0; i < N; i++){
            s = sc.next();
            if(L == s.length()){
                S.add(s);
            }
        }
        Collections.sort(S);
        System.out.println(String.join("", S));

    }
}
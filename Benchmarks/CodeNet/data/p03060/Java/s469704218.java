import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<Integer>A = new ArrayList<Integer>();
        List<Integer>B = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            A.add(a);
        }
        for(int i = 0; i < N; i++){
            int b = sc.nextInt();
            B.add(b);
        }
        int ans = 0;
        for(int i = 0; i < N; i++)if(A.get(i) > B.get(i))ans += A.get(i) - B.get(i);
        System.out.println(ans);
    }
}

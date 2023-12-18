import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> A = new ArrayList<String>();
        int i,flag;
        String searchWord;
        
        for (i = 0; i < N; i++) {
            A.add(sc.next());
            // System.out.println(A);
            searchWord = A.get(i);
            // System.out.println(searchWord);
            flag = A.indexOf(searchWord);
            // System.out.println(flag);
            if (flag != i) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

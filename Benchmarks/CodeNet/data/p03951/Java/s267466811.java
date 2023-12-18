import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
        
        int i = 0;
        int matchCount = 0;
        while(i < N) {
            String sSub = s.substring(N - i - 1, N);
            String tSub = t.substring(0, i + 1);
            System.out.println("test1:" + sSub);
            System.out.println("test2:" + tSub);

            if(sSub.equals(tSub)) {
                matchCount = i + 1;
            }
            i++;
        }
        
        System.out.println(N * 2 - matchCount);
    }
}

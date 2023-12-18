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
            String sSub = s.substring(s.length() - i - 1, s.length());
            String tSub = t.substring(0, i + 1);

            if(sSub.equals(tSub)) {
                matchCount = i + 1;
                break;
            }
            i++;
        }
        
        System.out.println(s.length() + t.length() - matchCount);
    }
}

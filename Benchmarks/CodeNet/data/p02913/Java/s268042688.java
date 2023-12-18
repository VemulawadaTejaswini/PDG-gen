import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int a = (int)Math.floor(n/2.0);
        for(; a>0; a--) {
            boolean found = false;
            for(int i=0; i<n-a; i++) {
                String l = s.substring(i, i+a);
                if(s.indexOf(l, i+a) >= 0) {
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
        System.out.println(a);
    }
}

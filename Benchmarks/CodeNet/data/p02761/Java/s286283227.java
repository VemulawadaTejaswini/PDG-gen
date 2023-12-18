import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()-1;
        int m = in.nextInt();
        int[] s = new int[m];
        String[] c = new String[m];
        for(int i=0; i<m; i++) {
            s[i] = in.nextInt();
            c[i] = in.next();
        }
        int start = (int)Math.round(Math.pow(10, n));
        int end = start*10;
        if(start==1) {
            start = 0;
        }

        for(int i=start; i<end; i++) {
            String str = Integer.toString(i);
            boolean isOK = true;
            for(int j=0; j<m; j++) {
                if(!str.substring(s[j]-1, s[j]).equals(c[j])) {
                    isOK = false;
                    break;
                }
            }
            if(isOK) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}

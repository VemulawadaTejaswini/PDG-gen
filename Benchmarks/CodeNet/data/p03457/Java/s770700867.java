import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nt = 0, nx = 0, ny = 0;
        boolean bool = true;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xlen = Math.abs(nx-x);
            int ylen = Math.abs(ny-y);
            int tlen = t-nt;
            if(tlen < xlen + ylen || tlen % 2 != (xlen+ylen) % 2){
                bool = false;
                break;
            }
        }
        System.out.println(bool ? "Yes" : "No");
    }
}

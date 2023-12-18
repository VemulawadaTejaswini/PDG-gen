import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int H[] = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = s.nextInt();
        }
        boolean bl = false;
        int ch = 0;
        for (int i = 0; i < (N-1); i++) {
            if (H[i] <= H[i + 1]) {
                ch++;
            }
        }
        if (ch ==( N-1)) {
            bl = true;
        }
        if (!bl) {
            for (int i = 0; i <( N-1); i++) {
                if (H[i] > H[i + 1]) {
                    H[i] -= 1;
                    break;
                }
            }
            ch = 0;
            for (int i = 0; i <( N-1); i++) {
                if (H[i] <= H[i + 1]) {
                    ch++;
                }
            }
            if(ch==(N-1)){
                bl=true;
            }
        }
       if(bl){
           System.out.print("Yes");
       }
       else{
           System.out.print("No");
       }
    }
}


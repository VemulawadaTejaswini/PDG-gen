import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c[] = new int[4];
        for(int i = 0;i < 3;++i){
            ++c[sc.nextInt() - 1];
        }
        for(int i = 0;i < 3;++i){
            if(c[i] == 0 || c[i] >= 3) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}



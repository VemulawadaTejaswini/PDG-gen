import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] pos = new int[n];
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt() - 1;
            pos[p[i]] = i;
        }
        sc.close();

        int max = 0;

        if(n == 1){
            System.out.println(0);
            return;
        }

        for(int i=0; i<n-1; i++){
            int len = 1;
            int mpos = pos[i];
            for(int j=i+1; j<n; j++){
                if(pos[j] > mpos){
                    mpos = pos[j];
                    len++;
                }else{
                    break;
                }
            }
            if(len > max) max = len;
            i += len - 1;
        }

        System.out.println(n - max);
    }
}
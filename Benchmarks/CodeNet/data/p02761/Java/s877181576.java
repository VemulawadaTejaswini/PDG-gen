import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(),
            M = scn.nextInt();
        int s[] = new int[M],
            c[] = new int[M];
        for(int i = 0;i<M;i++){
            s[i] = scn.nextInt();
            c[i] = scn.nextInt();
        }

        int ans = -1;
        for(int i=(int)Math.pow(10,N-1);i<(int)Math.pow(10,N);i++){
            Boolean flag = true;
            for(int j=0;j<M;j++){
                String str = String.valueOf(i);
                String C = String.valueOf(c[j]);
                if(!str.substring(s[j]-1,s[j]).equals(C)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}

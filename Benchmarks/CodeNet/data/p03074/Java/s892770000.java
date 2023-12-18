
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] s = sc.next().split("");
        int[] len = new int[n + 3];
        int index = 0;
        boolean is0 = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("0")) {
                if (!is0)index++;
                is0 = true;
            } else {
                if (is0)index++;
                is0 = false;
            }
            len[index]++;
        }
        int res = 0;
        for (int i = 0; i <= index; i += 2) {
            int tmp = 0;
            int count = k;
            int in = 0;
            while(count>=0){
                if(i+in>index)break;
                tmp += len[i+in];
                if((i+in)%2==1)count--;
                if(count==0){
                    tmp += len[i+in+1];
                    break;
                }
                in++;
            }
            if(count>0)break;
            res = Math.max(res, tmp);
        }
        System.out.println(res);
    }
}
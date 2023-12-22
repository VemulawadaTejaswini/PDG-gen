
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean f=true;
        while(true){
            
            int sum = sc.nextInt();
            if(sum==0)break;
            if(!f)System.out.println();
            f=false;
            int[] c = new int[4];
            int coins = 0;
            for (int i = 0; i < c.length; i++) {
                c[i]=sc.nextInt();
                coins+=c[i];
            }
            int[] ans=new int[4];
            int[] p = {10,50,100,500};
            int min = 1<<29;
            for (int i = 0; i <= c[0]; i++) {
                for (int j = 0; j <= c[1]; j++) {
                    for (int j2 = 0; j2 <= c[2]; j2++) {
                        for (int k = 0; k <= c[3]; k++) {
                            int s = 0;
                            s+=i*p[0];
                            s+=j*p[1];
                            s+=j2*p[2];
                            s+=k*p[3];
                            if(s<sum)continue;
                            int[] change = change(sum,s);
//                            System.out.println(Arrays.toString(change));
                            if(i>0&&change[0]>0)continue;
                            if(j>0&&change[1]>0)continue;
                            if(j2>0&&change[2]>0)continue;
                            if(k>0&&change[3]>0)continue;

                            if(min>coins-(i+j+j2+k)+change[4]){
                                ans[0]=i;
                                ans[1]=j;
                                ans[2]=j2;
                                ans[3]=k;
                                min=coins-(i+j+j2+k)+change[4];
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < p.length; i++) {
                if(ans[i]==0)continue;
                System.out.println(p[i]+" "+ans[i]);
            }
        }
    }

    static int[] change(int sum,int s){
        
        int[] p = {10,50,100,500};
        s = s-sum;
        int res[] = new int[5];
        for (int i = 3; i >= 0; i--) {
            while(s-p[i]>=0){
                s-=p[i];
                res[i]++;
                res[4]++;
            }
        }
        return res;
    }
}
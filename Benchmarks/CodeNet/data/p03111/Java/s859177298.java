import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int[] l=new int[n];
        for (int i=0;i<n;i++)l[i]=sc.nextInt();
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < (1 << n); j++) {
                int la=0,lb=0,lc=0,mp=0;
                //11→aの材料、10→bの材料、01→cの材料、00→何もしない
                for (int k = 0; k < n; k++) {
                    int bit1=(i>>k)&1;
                    int bit2=(j>>k)&1;
                    if(bit1==1&&bit2==1){
                        if(la>0)mp+=10;
                        la+=l[k];
                    }else if(bit1==1&&bit2==0){
                        if(lb>0)mp+=10;
                        lb+=l[k];
                    }else if(bit1==0&&bit2==1){
                        if(lc>0)mp+=10;
                        lc+=l[k];
                    }
                }
                if(la>0&&lb>0&&lc>0){
                    ans=min(ans,mp+abs(a-la)+abs(b-lb)+abs(c-lc));
                }
            }
        }
        out.println(ans);
    }
}
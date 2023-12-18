import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] sum; int[] c;
        if(n >= m){
            c = a;
            sum = new int[n];
        }else{
            c = b;
            sum = new int[m];
        }
        Arrays.fill(sum, 0);
        int N = 100001;
        Lists[] recorda = new Lists[n];
        Lists[] recordb = new Lists[m];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        sc.close();

        int Max = Math.max(n, m);
        int Min = Math.min(n,m);
        for(int i=0;i<Max;i++){
            if(i < Min){
                int ka = a[i];
                int kb = b[i];
                if(ka == kb){
                    if(i==0){
                        sum[i] = 1;
                    }else{
                        sum[i] = sum[i]*2;
                    }
                }
                if(recorda[ka] != null){
                    for(int j=0;j<recorda[ka].array.size();j++){
                        int la = recorda[ka].array.get(j);
                        sum[i] += sum[la-1];
                    }
                }else{
                    recorda[ka] = new Lists();
                }
                recorda[ka].add(i);
                if(recordb[kb] != null){
                    for(int j=0;j<recorda[kb].array.size();j++){
                        int lb = recorda[kb].array.get(j);
                        sum[i] += sum[lb-1];
                    }
                }else{
                    recordb[kb] = new Lists();
                }
                recordb[kb].add(i);
            }else{
                int kc = c[i];
                if(c==a){
                    if(recorda[kc] != null){
                        for(int j=0;j<recorda[kc].array.size();j++){
                            int la = recorda[kc].array.get(j);
                            sum[i] += sum[la-1];
                        }
                    }else{
                        recorda[kc] = new Lists();
                    }
                }else{
                    if(recordb[kc] != null){
                        for(int j=0;j<recordb[kc].array.size();j++){
                            int lb = recordb[kc].array.get(j);
                            sum[i] += sum[lb-1];
                        }
                    }else{
                        recordb[kc] = new Lists();
                    }
                }
            }
        }
        System.out.println(sum[Max-1]);
    }
}
class Lists{
    ArrayList<Integer> array = new ArrayList<>();
    public Lists(){
        array.add(0);
    }
    public void add(int i){
        array.add(i);
    }
}
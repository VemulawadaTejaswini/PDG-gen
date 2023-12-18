import java.util.*;

public class ABC057{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int a=Integer.parseInt(sc.next());
        int b=Integer.parseInt(sc.next());
        ArrayList<Long> v=new ArrayList<Long>();
        for(int i=0;i<n;i++){
            v.add(Long.parseLong(sc.next()));
        }
        sc.close();
        Collections.sort(v,(v1, v2)->{
            if(v1<v2) return 1;
            else if(v1>v2) return -1;
            else return 0;
        });
        long min=v.get(a-1);
        int minCount=0;
        int befA=1;
        double avg=0;
        for(int i=0;i<n;i++){
            if(i<a) avg+=v.get(i);
            if(v.get(i)==min) minCount++;
            if(i==a-1) befA=minCount;
        }
        avg=avg/((double) a);
        long pattern=0;
        long minCj;
        int minCount2;
        int j_max=befA;
        if(min==v.get(0)) j_max+=b-a;
        for(int j=befA;j<=j_max;j++){
            minCount2=minCount;
            minCj=1;
            for(int d=1;d<=j;d++){
                minCj*=minCount2;
                minCount2--;
                minCj/=d;
            }
            pattern+=minCj;
        }
        System.out.println(String.format("%.6f", avg));
        System.out.println(pattern);
    }
}
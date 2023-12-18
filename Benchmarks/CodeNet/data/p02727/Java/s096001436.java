import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long[] p=new long[a];
        long[] q=new long[b];
        long[] r=new long[c];
        for(int i=0;i<a;i++){
            p[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            q[i]=sc.nextInt();
        }
        for(int i=0;i<c;i++){
            r[i]=sc.nextInt();
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        int countp=0;
        int countq=0;
        int countr=0;
        long ans=0;
        for(int i=0;i<x;i++){
            if(countr>=c){
                ans+=p[a-countp-1];
                countp++;
            }else if(p[a-countp-1]>=r[c-countr-1]){
                ans+=p[a-countp-1];
                countp++;
            }else{
                ans+=r[c-countr-1];
                countr++;
            }
        }
        for(int i=0;i<y;i++){
            if(countr>=c){
                ans+=q[b-countq-1];
                countq++;
            }else if(q[b-countq-1]>=r[c-countr-1]){
                ans+=q[b-countq-1];
                countq++;
            }else{
                ans+=r[c-countr-1];
                countr++;
            }
        }
        System.out.println(ans);
    }
    
}

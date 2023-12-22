import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt();
        int A[]=new int[W];
        for(int i=0;i<W;i++) A[i]=i+1;
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            String S=sc.next();
            int l=S.length();
            char C[]=S.toCharArray();
            int a=0;
            int b=0;
            int now=0;
            while(C[now]!=','){
                a=a*10+C[now]-'0';
                now++;
            }
            now++;
            for(int j=now;j<l;j++) b=b*10+C[j]-'0';
            a--;
            b--;
            int tmp=A[a];
            A[a]=A[b];
            A[b]=tmp;
        }
        for(int i=0;i<W;i++) System.out.println(A[i]);
    }
}

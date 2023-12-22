import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L=Integer.parseInt(sc.next());
        int A=Integer.parseInt(sc.next());
        int B=Integer.parseInt(sc.next());
        int C=Integer.parseInt(sc.next());
        int D=Integer.parseInt(sc.next());
        int K=A/C+1;
        int S=B/D+1;
        int ans;
        if(K>S){
            ans=L-K;
        }else{
            ans=L-S;
        }
        System.out.println(ans);
    }
}
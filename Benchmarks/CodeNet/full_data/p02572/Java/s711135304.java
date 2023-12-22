import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        // String S=sc.next(),T=sc.next();
        // int res=T.length(),count=0;
        // for(int i=0;i<(S.length()-T.length());i++){
        //     count=0;
        //     for(int j=0;j<T.length();j++){
        //         if(S.charAt(i+j)!=T.charAt(j)){
        //             count++;
        //         }
        //     }
        //     res=Math.min(res,count);
        //     if(res==0) break;
        // }
        // System.out.println(res);

        int N=sc.nextInt();
        long A[]=new long[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextLong();
        }
        long res=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                res+=A[i]*A[j];
                res%=1000000007;
            }
        }
        System.out.println(res);
    }
}
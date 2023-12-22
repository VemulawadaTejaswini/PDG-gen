import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next(),T=sc.next();
        int res=T.length();
        for(int i=0;i<=(S.length()-T.length());i++){
            int count=0;
            for(int j=0;j<T.length();j++){
                if(S.charAt(i+j)!=T.charAt(j)){
                    count++;
                }
            }
            res=Math.min(res,count);
        }
        System.out.println(res);


        // int N=sc.nextInt();
        // long A[]=new long[N],sum=0,pow=0,res;
        // for(int i=0;i<N;i++){
        //     A[i]=sc.nextLong();
        //     sum+=A[i];
        //     pow+=A[i]*A[i];
        // }
        // res=((sum*sum-pow)/2)%1000000007;
        // System.out.println(res);
    }
}
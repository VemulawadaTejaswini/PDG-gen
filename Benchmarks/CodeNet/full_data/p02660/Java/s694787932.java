import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long N=sc.nextLong(),res=0,M=N;
        for(int i=2;N!=1;i++){
            if(i<=(int)Math.sqrt(M)){
                res++;
                break;
            }
            else if(N%i==0){
                int s=0,t=1;
                while(N%i==0){
                    N/=i;
                    s++;
                    if(s==t){
                        s-=t;
                        t++;
                    }
                }
                res+=t-1;
            }
        }
        if(res==0) res++;
        System.out.println(res);
    }
}

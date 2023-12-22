import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        /*int N=sc.nextInt(),K=sc.nextInt(),P[]=new int[N],C[]=new int[N];
        long sum=0,s[]=new long[N];
        for(int i=0;i<N;i++){
            P[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            C[i]=sc.nextInt();
            sum+=C[i];
        }
        s[0]=C[0];
        sum*=K/N;
        int k=(int)K%N;
        long res=s[0];
        for(int i=1;i<N;i++){
            s[i]=s[i-1]+C[P[i-1]-1];
        }
        for(int i=0;i<N;i++){
            for(int j=1;j<=k;j++){
               res=Math.max(res,s[(i+j)%N]-((i+j)/N)*(sum*N/K)-s[i]);
            }
        }
        System.out.println(res+sum);*/

        long X=Math.abs(sc.nextLong()),K=sc.nextLong(),D=sc.nextLong(),end=0,endl=0;
        if(K>X/D){
            if(Math.abs(X-(X/D)*D)<Math.abs(X-((X/D)+1)*D)){
                end=Math.abs(X-(X/D)*D);
                endl=Math.abs(end-D);
                if((K-X/D)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }else{
                end=Math.abs(X-((X/D)+1)*D);
                endl=Math.abs(end+D);
                if((K-(X/D)-1)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }
        }
        else{
            end=Math.abs(X-D*K);
            endl=Math.abs(X+D*K);
            System.out.println(end<endl?end:endl);
        }
    }
}
/*else if(X==0){
                System.out.println(K%2==0?0:D);
            }*/
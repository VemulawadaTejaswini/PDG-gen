import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        out:for(;;){
        int max=keisan(A,N);
        int a=keisann(A,max,N);
        if(a>3){
            System.out.println(max*max);
            break out;
        }
        if((a==2)||(a==3)){
            for(;;){
            int maxx=keisan(A,N);
            int b=keisann(A,maxx,N);
            if(b>1){
                System.out.println(max*maxx);

                break out;
            }

        }
       
    }}


        
        
        
    }

    
    public static int keisan(int[]A,int N){
        int maxx=0;
        for(int i=0;i<N;i++){
            if(maxx<=A[i]){
                maxx=A[i];
            }
        }
        return maxx;
          

    }
    public static int keisann(int[]A,int maxx,int N){
        int a=0;

    for(int i=0;i<N;i++){
        if(maxx==A[i]){
            a++;
            A[i]=0;
        }}
        return a;
    }

       
        
    }
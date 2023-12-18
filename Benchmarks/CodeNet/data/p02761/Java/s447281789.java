import java.util.Scanner;

public class Main {

    public static boolean guess(int N, int M){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            int s=sc.nextInt()-1;
            int c=sc.nextInt();
            if(a[s]==-1)
                a[s]=c;
            else if(a[s]!=c)
                return false;
            if((N==2 && a[0]==0) ||(N==3 && a[0]==0))
                return false;
        }
        int sum=0;
        for(int i=0;i<N;i++){
            if(a[i]==-1)
                a[i]=0;
            sum=sum*10+a[i];
        }
        System.out.println(sum);
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
           System.out.println(guess(N,M)?"":"-1");    
    }  
}
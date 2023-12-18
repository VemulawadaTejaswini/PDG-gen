import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),a[]=new int[N];
        boolean F[]=new boolean[N];
        Arrays.fill(F,false);
        for(int i=0;i<N;i++){
            a[i]=(sc.nextInt()-1);
        }
        int f=0,t=a[0],c=0;
        while(true){
            c++;
            if(F[f]||F[1]){
                break;
            }
            F[f]=true;
            int b=t;
            f=a[t];
            t=a[b];
        }
        System.out.println(F[1]?c-1:-1);
    }
}

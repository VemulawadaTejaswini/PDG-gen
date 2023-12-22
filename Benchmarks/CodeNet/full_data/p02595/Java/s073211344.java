import java.util.*;

public class Main{
    public static int calculatePoints(int n,int d,int[] a,int[] b){
        int ret = 0;
        for(int i=0;i<n;i++){
            if((long)a[i]*a[i]+(long)b[i]*b[i]<=(long)d*d) ret++;
        }
        return ret;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0,D = 0;
        int[] X = new int[1];
        int[] Y = new int[1];

        while(sc.hasNext()){
            N = sc.nextInt();
            D = sc.nextInt();
            X = new int[N];
            Y = new int[N];
            for(int i=0;i<N;i++){
                X[i] = sc.nextInt();;
                Y[i] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(calculatePoints(N,D,X,Y));

        /*int N = 12;
        int D = 3;
        int[] X = {1,1,1,1,1,1,2,2,2,3,3,3};
        int[] Y = {1,1,1,1,2,3,1,2,3,1,2,3};
        System.out.println(calculatePoints(N,D,X,Y));*/
    }
}

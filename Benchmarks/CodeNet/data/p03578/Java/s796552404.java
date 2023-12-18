import java.util.Scanner;


public class Main{

    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int[] D = new int[N];
       for(int i=0; i<N; i++){
        D[i] = scan.nextInt();
    }
    int M = scan.nextInt();
       int[] T = new int[M];
       for(int i=0; i<M; i++){
        T[i] = scan.nextInt();
    }

    int[] mapD = new int[200000];
    int[] mapT = new int[200000];

    for(int i=0; i<N; i++){
        mapD[D[i]] ++;
    }

    for(int i=0; i<M; i++){
        mapT[T[i]] ++;
    }

    for(int i=0; i<200000; i++){
        if(mapD[i] < mapT[i]){
            System.out.println("NO");
            scan.close();
            return;
        }
    }

    System.out.println("YES");

       scan.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int a[]=new int[M];
        for(int i=0; i<M; i++){
            a[i]=sc.nextInt();
        }

        int res=0;
        int count=0;
        int plc = X;
        for(int i=0; i<X; i++){
            plc--;
            for(int j=0; j<M; j++){
                if(plc==a[j]){
                    count++;
                    break;
                }
            }
        }
        res = count;
        
        count=0;
        plc=X;
        for(int i=0; i<N-X; i++){
            plc++;
            for(int j=0; j<M; j++){
                if(plc==a[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(Math.min(res, count));

        


    }
}
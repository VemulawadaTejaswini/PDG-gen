import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int[] num_road=new int[N];
        int[] a=new int[M];
        int[] b=new int[M];
        int i;
        for(i=0;i<N;i++){
            num_road[i]=0;
        }
        for(i=0;i<M;i++){
            a[i]=scan.nextInt();
            b[i]=scan.nextInt();
            num_road[a[i]-1]++;
            num_road[b[i]-1]++;
        }
        for(i=0;i<N;i++){
            System.out.println(num_road[i]);
        }
    }
}
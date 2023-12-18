import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int sum=Math.abs(A[N-1])+Math.abs(A[0]);
        for(int i=0;i<N-1;i++){
            sum+=Math.abs(A[i]-A[i+1]);
        }
        
        System.out.println(sum+Math.abs(A[1])-Math.abs(A[0])-Math.abs(A[1]-A[0]));
        for(int i=1;i<N-1;i++){
            int dis=0;
            dis=Math.abs(A[i+1]-A[i-1])-Math.abs(A[i]-A[i-1])-Math.abs(A[i+1]-A[i]);
            System.out.println(sum+dis);
        }
        System.out.println(sum+Math.abs(A[N-2])-Math.abs(A[N-1])-Math.abs(A[N-2]-A[N-1]));
    }
}
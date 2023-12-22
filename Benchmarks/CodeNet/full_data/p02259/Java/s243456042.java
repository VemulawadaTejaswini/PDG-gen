import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=1,sum=0;
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)A[i]=sc.nextInt(); 
        while(flag==1){
            flag=0;
            for(int j=N-1;j>0;j--){
                int data;
                if(A[j]<A[j-1]){
                    sum++;
                    data=A[j];
                    A[j]=A[j-1];
                    A[j-1]=data;
                    flag=1;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(i!=N-1)System.out.printf(A[i]+" ");
            else System.out.println(A[i]);
        }
        System.out.println(sum);
    } 
}

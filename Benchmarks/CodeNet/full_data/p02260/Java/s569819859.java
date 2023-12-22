import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int count=0;
        for(int j=0;j<N;j++){
            int min = j;
            for(int k=j;k<N;k++){
                if(A[k]<A[min]){
                    min = k;
                }
            }
            if(j==min){
                int x = A[min];
                A[min] = A[j];
                A[j] = x;
            }
            else{
                int x = A[min];
                A[min] = A[j];
                A[j] = x;
                count++;
            }
        }
        for(int m=0;m<N;m++){
            if(m==N-1){
                System.out.printf("%d",A[m]);
            }else{
                System.out.printf("%d ",A[m]);
            }
        }
        System.out.printf("\n");
        System.out.println(count);
    }
}


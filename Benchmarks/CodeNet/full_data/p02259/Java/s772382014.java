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
        for(int s=0;s<N-1;s++){
            for(int j=N-1;j>s;j--){
                if(A[j]<A[j-1]){
                    int x = A[j];
                    A[j]=A[j-1];
                    A[j-1]=x;
                    count++;
                }
            }
        }
        for(int k=0;k<N;k++){
            if(k==N-1){
                System.out.printf("%d",A[k]);
            }else{
                System.out.printf("%d ",A[k]);
            }
        }
        System.out.printf("\n");
        System.out.println(count);
        }
    }


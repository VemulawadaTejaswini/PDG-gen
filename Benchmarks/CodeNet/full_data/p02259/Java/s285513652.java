import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int count = 0;
        int n = sc.nextInt();
        int A[] = new int[n];
        for(i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    int r = A[i];
                    A[i] = A[j];
                    A[j] = r;
                    count++;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.printf("%d ",A[i]);
        }
        System.out.printf("\n");
        System.out.printf("%d\n",count);
    }
}


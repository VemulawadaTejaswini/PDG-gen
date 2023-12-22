import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A;
        A = new int[n];
        int count = 0;
        for(int i=0;i<n;++i){
            A[i] = sc.nextInt();
        }


        int minj;
        for(int i=0;i<n-1;++i){  //selectionsort
            minj = i;
            for(int j=i;j<n;++j){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            if(i!=minj){
                int c;
                c = A[i];
                A[i] = A[minj];
                A[minj] = c;
                count++;
            }
        }

        print(A, n);
        System.out.println(count);
    }

    public static void print(int A[], int n){
        for(int i=0;i<n;++i){
            System.out.print(A[i]);
            if(i<n-1){System.out.print(" ");}
        }
        System.out.println();
    }
}


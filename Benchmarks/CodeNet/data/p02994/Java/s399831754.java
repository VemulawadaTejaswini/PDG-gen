import java.util.Scanner;

class Main{
    private static int min(int a,int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int A[];
        A = new int[N];

        for(int i = 0;i < N;i++){
            A[i] = L + (i + 1) - 1;
        }

        int AllA = 0;
        for(int n = 0;n < N;n++){
            AllA += A[n];
        }

        int B[];
        B = new int[N];

        for(int m = 0;m < N;m++){
            B[m] = Math.abs(AllA - (AllA - A[m]));
        }

        int minS = 0;
        int minB = B[0];
        for(int s = 1;s < N;s++){
            minS = min(minB,B[s]);
        }

        System.out.println(AllA - A[minS]);


    }
}
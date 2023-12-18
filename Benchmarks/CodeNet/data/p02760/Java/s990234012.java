import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A[] = new int [9];
        int a[] = new int [9]; 
        for(int i = 0; i < 9; i++){
                A[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        int B[] = new int[N];
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
            for(int j = 0; j < 9; j++){
                if(B[i] == A[j]){
                    a[j] = 1;
                }
            }
        }
        if(a[0] == 1 && a[1] == 1 && a[2] == 1){
            System.out.println("Yes");
        }else if(a[3] == 1 && a[4] == 1 && a[5] == 1){
            System.out.println("Yes");
        }else if(a[6] == 1 && a[7] == 1 && a[8] == 1){
            System.out.println("Yes");
        }else if(a[0] == 1 && a[3] == 1 && a[6] == 1){
            System.out.println("Yes");
        }else if(a[1] == 1 && a[4] == 1 && a[7] == 1){
            System.out.println("Yes");
        }else if(a[2] == 1 && a[5] == 1 && a[8] == 1){
            System.out.println("Yes");
        }else if(a[0] == 1 && a[4] == 1 && a[8] == 1){
            System.out.println("Yes");
        }else if(a[2] == 1 && a[4] == 1 && a[6] == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

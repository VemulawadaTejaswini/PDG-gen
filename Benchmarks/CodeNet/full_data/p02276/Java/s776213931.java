import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            A[i] = sc.nextInt();
        int x = A[n-1];
        int i = -1;
        for(int j = 0 ; j < n-1 ; j++){
            if(A[j] <= x){
                i++;
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        int tmp = A[n-1];
        A[n-1] = A[i+1];
        A[i+1] = tmp;
        StringBuilder sb = new StringBuilder();
        for(int j = 0 ; j < n-1 ; j++){
            if(j == i+1)
                sb.append("[" + A[j] + "] ");
            else
                sb.append(A[j] + " ");
        }
        if(i == n-2)
            System.out.println(sb.append("[" + A[n-1] + "]"));
        else
            System.out.println(sb.append(A[n-1]));
    }
}

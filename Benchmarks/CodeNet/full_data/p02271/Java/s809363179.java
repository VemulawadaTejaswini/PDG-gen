import java.util.Scanner;
public class Main{
    public static boolean check(int num, int A[], int start){
        if(start == A.length || num <= 0)
            return false;
        else if(A[start] == num)
            return true;
        else
            return (check(num-A[start],A,start+1) || check(num,A,start+1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            A[i] = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int num = sc.nextInt();
            if(check(num,A,0))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}

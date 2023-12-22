import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        String[] A = scanner.nextLine().split(" ");
        String[] B = scanner.nextLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);

        int a_count = 0;
        int b_count = 0;

        int i = 0;
        while (i <= k){
            if(Integer.parseInt(A[a_count]) < Integer.parseInt(B[b_count])){
                if(a_count <= n){
                    i = i + Integer.parseInt(A[a_count]);
                    a_count += 1;
                }else{
                    i = i + Integer.parseInt(B[b_count]);
                }
            }else{
                if(b_count <=n){
                    i = i + Integer.parseInt(B[b_count]);
                    b_count += 1;
                }else{
                    i = i+ Integer.parseInt(A[a_count]);
                }
            }
        }
        System.out.println(a_count + b_count);
    }
}

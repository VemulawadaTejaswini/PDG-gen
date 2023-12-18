import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(2*B > A){
            System.out.println("0");
        }else{
            System.out.println(A-2*B);
        }
        return;
    }
}


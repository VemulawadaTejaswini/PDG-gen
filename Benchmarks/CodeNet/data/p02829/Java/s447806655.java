import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[3];
        ans[0] = 1;
        ans[1] = 2;
        ans[2] = 3;
        int A = sc.nextInt();
        int B = sc.nextInt();
        ans[A - 1] = 0;
        ans[B - 1] = 0;
        for(int i = 0; i < 3; i++){
            if(ans[i] != 0){
                System.out.println(ans[i]);
            }
        }
    }
}

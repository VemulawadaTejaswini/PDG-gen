import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+1];
        int count = 0;
        for(int i = 1; i <= N;i++){
            num[i] = i;
            if(String.valueOf(num[i]).length() % 2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
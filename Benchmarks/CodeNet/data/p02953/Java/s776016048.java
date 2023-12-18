import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long prev = -1;
        String result = "Yes";
        for(int i = 0; i < N; i++){
            long now = sc.nextLong();
            if(now - prev <= -1){
                result = "No";
                break;
            }
            if(now - prev == 0){
                prev = now;
            }else{
                prev = now - 1;
            }
        }
        System.out.println(result);
    }
}

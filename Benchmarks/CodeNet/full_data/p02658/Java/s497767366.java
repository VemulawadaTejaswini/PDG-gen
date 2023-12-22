import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Long> kazu = new ArrayList<>();
        long ans = 1;
        for(int i = 0;i < N;i++){
            long temp = sc.nextLong();;
            ans *= temp;
        }
        long max = 1000000000000000000l;
        if(ans <= max){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}

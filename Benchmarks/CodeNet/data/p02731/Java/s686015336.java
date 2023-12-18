import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int max = 0;
        
        for(int i=1; i<N-1; i++){
            for(int j=1; j<N-i; j++){
                ans = i*j*(N-i-j);
                if(ans > max){
                    max = ans;
                }
            }
        }
        System.out.println(max);
    }
}
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        int count = 0;
        int down_count = 0;
        for(int i = 1; i < N; i++){
            int num = H[i] - H[i - 1];
            if(num >= -1){
                count++;
                //System.out.println(num);
                if(num == -1){
                    H[i - 1]--;
                    down_count++; 
                }else{
                    down_count--;
                    if(down_count < 0){
                        down_count = 0;
                    }
                }
                if(down_count == 2){
                    System.out.println("No");
                    count--;
                    break;
                }
            }else{
                System.out.println("No");
                break;
            }
        }
        if(count == N - 1){
            System.out.println("Yes");
        } 
    }
}
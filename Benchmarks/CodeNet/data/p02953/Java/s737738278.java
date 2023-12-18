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
        int max_height = 0;
        for(int i = 1; i < N; i++){
            int num = H[i] - H[i - 1];
            if(num >= -1){
                count++;
                //System.out.println(num);
                if(num == -1){
                    H[i - 1]--; 
                }
                if(max_height < H[i -1]){
                    max_height = H[i -1];
                }
                if(max_height > H[i]){
                    System.out.println("No");
                    count--;
                    break;
                }
            }else{
                System.out.println("No");
                count--;
                break;
            }
        }
        if(count == N - 1){
            System.out.println("Yes");
        } 
    }
}
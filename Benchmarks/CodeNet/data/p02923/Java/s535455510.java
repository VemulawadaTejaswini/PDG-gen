import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = 0;
        int count = 0;
        int[] H = new int[N+10];
        H[0] = sc.nextInt();
        for(int i = 1; i < N; i++){
            H[i] = sc.nextInt();
            if(H[i-1] >= H[i]){
                count += 1;
            }else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if(count > max){
            max = count;
        }
        System.out.println(max);
    }
}
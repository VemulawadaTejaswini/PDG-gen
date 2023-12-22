import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve2197();
    }

    public static void solve2197() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            int count=0;
            for(int i = 2; i < N; i++){
                if(N==1||N==2){
                    break;
                }
                if(i % 2 == 0){
                    if((N -i/2)%i == 0 && (N -i/2 - i)/i - i + 1> 0){
                        count++;
                    }
                } else {
                    if(N%i == 0 && (N/i - i/2) > 0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
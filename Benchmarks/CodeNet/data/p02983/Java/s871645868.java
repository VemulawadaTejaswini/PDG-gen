
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int L = stdIn.nextInt(); int R = stdIn.nextInt();
        int answer = 2018;
        if( R - L + 1 >= 2019) answer = 0;
        else{
            answer = (L * (L + 1)) % 2019;
            for(int i = L + 2 ; i <= R; i++){
                if( i % 2019 == 0){
                    answer = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
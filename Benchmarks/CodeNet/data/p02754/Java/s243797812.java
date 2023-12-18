import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        long N = Long.parseLong(S[0]);
        long A = Long.parseLong(S[1]);
        long B = Long.parseLong(S[2]);
        sc.close();

        long length = 0;
        long blueCount = 0;
        while(true){
            long befLength = length;
            length += A;
            if(length >= N){
                long diff = N - befLength;
                blueCount += diff;
                break;
            }else{
                blueCount += A;
            }
            length += B;
            if(length >= N){
                break;
            }
        }

        System.out.println(blueCount);
                
    }

}

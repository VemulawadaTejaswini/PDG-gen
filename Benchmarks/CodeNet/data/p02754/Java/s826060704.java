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
        boolean isFinish = false;
        while(true){
            for(int i = 0; i < A; i++){
                length++;
                if(length > N){
                    isFinish = true;
                    break;
                }
                blueCount++;
            }

            for(int i = 0; i < B; i++){
                length++;
                if(length > N){
                    isFinish = true;
                    break;
                }
            }
            if(isFinish){
                break;
            }
        }

        System.out.println(blueCount);
                
    }

}
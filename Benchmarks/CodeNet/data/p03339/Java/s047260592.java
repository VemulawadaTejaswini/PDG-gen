import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.next();
        int min_count = 3000001;
        for(int j = 0; j < N; j++){
            String subL;
            String subR;
            int count = 0;
            if(j == 0){
                subR = input;
                for(String str: subR.split("")){
                    if(str.equals("E")){
                        count++;
                    }
                }
            }else if(j == N - 1){
                subL = input;
                for(String str: subL.split("")){
                    if(str.equals("W")){
                        count++;
                    }
                }
            }else{
                subL = input.substring(0, j);
                subR = input.substring(j + 1, N);
                for(String str: subR.split("")){
                    if(str.equals("E")){
                        count++;
                    }
                }
                for(String str: subL.split("")){
                    if(str.equals("W")){
                        count++;
                    }
                }
            }
            min_count = Math.min(count, min_count);
        }
        System.out.println(min_count);
    }
}

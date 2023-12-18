import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
       int[] intList =new int[N];
        
        for(int i = 0; i < N; i++) {
            intList[i] =sc.nextInt();
        }
        
        for(int i = 0; i < N-2; i++) {
            if(intList[i] != intList[i+2]) {
                count++;
            }
        }
        
        System.out.print(count);
    }

}


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //int A = sc.nextInt();
        //int B = sc.nextInt();
        int N = sc.nextInt();
        long value = 1;
        for(int i=0;i<N;i++){
            value *= sc.nextLong();
        }
        
        if(value > 1000000000000000000l){
            value = -1;
        }
        
        System.out.println(value);
    }
}

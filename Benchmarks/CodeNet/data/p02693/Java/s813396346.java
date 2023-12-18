import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        
        int K = in.nextInt();
        in.nextLine();
        int A = in.nextInt();
        int B = in.nextInt();
        

        boolean isDone = false;
        
        for(int i = A; i <= B; i++) {
            if(i%K == 0) {
                isDone = true;
                System.out.println("OK");
                break;
            }
        }
        
        if(!isDone) System.out.println("NG");
    }
    

        
}

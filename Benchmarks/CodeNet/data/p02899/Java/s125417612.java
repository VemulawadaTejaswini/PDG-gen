import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        int[] A = new int[N + 1];
        
        for(int i = 1; i < N + 1; i++){
            A[sc.nextInt()] = i;
        }
        
        String line = "";
        for(int i = 1; i < N + 1; i++){
            line += A[i];
            if(i != N ) line += " ";
        }
        
        System.out.println(line);
        
    }
}


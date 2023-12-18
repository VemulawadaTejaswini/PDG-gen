import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        String S[] = line.split("");
        int count = 0;
        for(int i = 0; i < N - 1 ; i++){
            if(S[i].equals("#")){
                if(S[i+1].equals(".")){
                    S[i+1] = "#";
                    count++;
                }
                    
            }
        }
        System.out.println(count);
        
        
    }
}

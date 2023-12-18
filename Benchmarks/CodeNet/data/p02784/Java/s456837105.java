import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        String P = null;
        
        for(int i=0;i<N;i++){
            H -= sc.nextInt();
        }
        
        if(H <= 0){
            P = "Yes";
        } else {
            P = "No";
        }
        System.out.println(P);
    }
}

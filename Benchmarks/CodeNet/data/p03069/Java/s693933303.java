import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc =new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        String bw = "#.";
        int len = S.length();
        int count = 0;

        for(int i = 0; i < len - 1; i++){
            if(S.substring(i,i+2).equals(bw)){
                count++;    
            }
        }
        System.out.println(count);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String[] splitS = S.split("", 0);
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            if(i > 0){
                if(splitS[i].equals(splitS[i-1])){
                    continue;
                }
            }
            sum++;
        }
        
        System.out.println(sum);
    }
}
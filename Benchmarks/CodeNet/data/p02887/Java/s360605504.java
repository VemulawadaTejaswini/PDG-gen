import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        
        int count = 1;
        char current = S.charAt(0);
        for(int i= 1; i<N; i++){
            if(current != S.charAt(i)){
                count++;
            }
            current = S.charAt(i);
        }
        System.out.println(count);
    }
}
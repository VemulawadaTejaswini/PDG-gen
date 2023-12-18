import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        char answer = 1;
        for(int i = 0; i < k; i++){
            if(s.charAt(i) != '1'){
                answer = s.charAt(i);
                break;
            }
        }
        System.out.print(answer);
    }
}
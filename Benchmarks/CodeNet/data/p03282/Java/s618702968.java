import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        char answer = 0;
        int countone = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '1'){
                answer = s.charAt(i);
            } else {
                countone++;
            }
        }
        if(k <= countone){
            System.out.print('1');
        } else {
            System.out.print(answer);
        }
    }
}
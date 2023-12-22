import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int staNum = sc.nextInt();
        int endNum = sc.nextInt();
        int divisor = sc.nextInt();
        int cnt = 0;
        for(int i=staNum;i<=endNum;i++){
            if(divisor%i == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}

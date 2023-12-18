import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;

        for(int i = a;i<=n;i++){
            int tmp = i;
            int tmp2 = 0;
            while(tmp >= 10){
                tmp2 += tmp%10;
                tmp = tmp/10;
            }
            tmp2 += tmp;
            if(tmp2 >= a && tmp2 <= b){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
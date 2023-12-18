import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int i = 10
        int len = 0;
        int cnt = 0;
        int sum = 0;
        int ans = 0;

        String tmp1;
        char tmp2;
        String tmp3;
        
        Do{
            len = String.valueOf(i).length();
            String tmp1 = String.valueOf(i);
            char tmp2 = ' ';
            while(len != 0) {
                tmp2 = tmp1.charAt(len-1);
                tmp3 = String.valueOf(tmp2);
                sum = Math.abs(sum - tmp);
                len--;
            }
            i++;
            if(sum == len - 1) {
                cnt++;
                ans = sum;
            }
        }while(cnt == K);
        System.out.println();
    }
}

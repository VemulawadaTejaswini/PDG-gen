import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int tmp = 2;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++){
            while(true){
                if(tmp%2==0 || tmp%3==0 || tmp%5==0 || tmp%7==0){
                    sb.append(tmp);
                    sb.append(" ");
                    sum += tmp;
                    tmp++;
                    break;
                }
                tmp++;
            }
            if(i%100==0) System.out.flush();
        }
        for(int i=tmp; i<=50000; i++){
            if((sum+i)%(2*3*5*7) == 0){
                System.out.println(new String(sb) + i);
                return;
            }
        }
    }
}
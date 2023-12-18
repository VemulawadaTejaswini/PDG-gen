import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N,A,B,sum=0,sum_num=0;
        N=sc.nextInt();
        A=sc.nextInt();
        B=sc.nextInt();
        for(int a=1;a<=N;a++){
            int num =a;
            int sum_num2=0;
            for(int b=0;b<4;b++){
                sum_num2 += num%10;
                num /=10;
            }
            if(A<=sum_num2&&sum_num2<=B){
                sum +=a;
            }
        }
        System.out.println(sum);
    }
}

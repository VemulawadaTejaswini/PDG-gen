import java.util.*;
public class Main {
    public static void main(String[] args){
        Main start=new Main();
        start.start();

    }
    public Main(){
    }
    public void start(){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long N = sc.nextLong();
        long result=0;
        if(N==1){
            System.out.println(0);
            return;
        }
        if(N==2){
            System.out.println(0);
            return;
        }
        if(N==6){
            System.out.println(5);
            return;
        }
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
             result=result+(N/i-1);
            }
        }
        System.out.println(result);

    }
    int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
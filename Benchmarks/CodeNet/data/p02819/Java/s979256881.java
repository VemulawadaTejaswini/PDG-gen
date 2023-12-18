import java.util.*;

class Main{
    //149c
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    static long[] num = new long[20];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int div;
        for(int i = a;i <= 100003;i++){
            div = 0;
            for(int j = 1;j <= i;j++){
                if(i%j==0)div++;
            }
            if(div==2){
                System.out.println(i);
                return;
            }
        }
    }
    
}
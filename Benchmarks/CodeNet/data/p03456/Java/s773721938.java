import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        long c=0;
        if(b>=1&&b<10){
            c=a*10+b;
        }
        if(b>=10&&b<99){
            c=a*100+b;
        }
        if(b==100){
            c=a*1000+b;
        }
        if(Math.sqrt(c)%1==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}


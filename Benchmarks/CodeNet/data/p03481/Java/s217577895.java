import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long X=scan.nextLong();
        long Y=scan.nextLong();
        int cnt=0;
        while(X<=Y){
            X*=2;
            ++cnt;
        }
        System.out.println(cnt);
    }
}
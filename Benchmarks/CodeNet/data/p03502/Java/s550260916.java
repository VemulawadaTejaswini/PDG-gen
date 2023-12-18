import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % dig(n) == 0) System.out.println("Yes");
        else System.out.println("No");
    }
    public static int dig(int n){
        int cnt = 0;
        while(n != 0){
            cnt += n % 10;
            n /= 10;
        }
        return cnt;
    }
}

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int ans = 1;
        int sum = a;
        while(true){
            if(sum >= b) break;
            sum += a-1;
            ans++;
        }
        System.out.println(ans);
    }
}

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int ans = 0;
        while(true){
            if(a*ans >= b) break;
            ans++;
        }
        System.out.println(ans);
    }
}
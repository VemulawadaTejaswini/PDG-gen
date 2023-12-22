import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pay = 1000;
        for(int i = 1;i<=n;i++){
            if(pay*i>=n){
                System.out.println(pay*i-n);
                break;
            }
        }
    }
}
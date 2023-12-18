import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = -1;
        for(int i = 1;i <= 1000;i++){
            if((i*8)/100==a && i/10==b){
                ans = i;
                break;
            }

        }
        
        System.out.println(ans);
    }
}
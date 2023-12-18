import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        for(int i = 31;i >= 1;i--){
            if(i*i <= x){
                ans = i*i;
                break;
            }
        }
        System.out.println(ans);
    }
}
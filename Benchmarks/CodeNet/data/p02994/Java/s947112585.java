import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] taste = new int[n];
        int ans = 0;
        int eat = 0;

        for(int i = 0;i < n;i++){
            taste[i] = l+i;
            ans += taste[i];
        }

        if(taste[0] < 0){
            for(int i = 0;i < n;i++){
                if(taste[i]==0){
                    eat = taste[i-1];
                }
            }
        }else{
            for(int i = 0;i < n;i++){
                if(taste[0]==0){
                    eat=taste[1];
                    break;
                }else if(taste[i] == 0){
                    eat = taste[i+1];
                }
            }
        }

        System.out.println(ans-eat);
    }
}
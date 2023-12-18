import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        

        for(int i = 1;i <= num;i++){
            for(int j = i;j > 0;j--){
                int cnt = 0;
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 8)
            ans++;
        }

        System.out.println(ans);
        
    }
}
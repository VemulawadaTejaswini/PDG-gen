import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        int ans = 0;
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 0;i < n+1;i++){
            if(i!=n){
                temp2 = sc.nextInt();
                if(temp1 == temp2){
                   count ++;
                }else{
                    ans += count / 2;
                    count = 1;
                }
                temp1 = temp2;
            }else{
                ans += count / 2;
            }
        }

        System.out.println(ans);
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] num = new int[]{A,B,C};
        Arrays.sort(num);
        int ans = 0;
        if((num[1]-num[0])%2==0){
            ans+=(num[1]-num[0])/2;
            ans+=num[2]-num[1];
        }
        else{
            ans++;
            ans+=(num[1]-num[0]-1)/2;
            ans+=num[2]+1-num[1];
        }
        System.out.println(ans);
    }
}
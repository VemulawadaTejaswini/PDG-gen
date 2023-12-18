import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = 0;

        for(int i = 0;i<=n;i++){
            double num = Math.sqrt(i);
            if(i==num*num){
                ans=i;
            } 
        }
        System.out.println(ans);
    }
}



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int pow;
        int ans=1;
        for(int i=2;i<=Math.sqrt(x);i++){
            pow=1;
            while(Math.pow(i, ++pow)<=x){
                ans=Math.max(ans,(int)Math.pow(i, pow));
            }
        }
        System.out.println(ans);
        

    }
}
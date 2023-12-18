import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=(int) (Math.pow(2,n)+1-Math.pow(2,a)-Math.pow(2,b));
        ans=ans%(1000000007);
        System.out.println(ans);
    }

}
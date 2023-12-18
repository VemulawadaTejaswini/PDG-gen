import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=(int) Math.floor(Math.log(n)/Math.log(k));
        System.out.println(ans);
    }

}
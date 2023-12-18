import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        if(s<=n){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }
}
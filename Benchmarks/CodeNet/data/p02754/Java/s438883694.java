import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a+b<n){
            System.out.println(a);
        }else{
        System.out.println(n-b);
        }
        
    }
}

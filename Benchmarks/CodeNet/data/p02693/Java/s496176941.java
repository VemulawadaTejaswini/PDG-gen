import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if((a==k || b==k) || (a<k && k<b)){
            System.out.println("OK");
            System.exit(0);
        }
        else if(b < k){
            System.out.println("NG");
            System.exit(0);
        }
        if(a==b){
            if(a%k == 0){
                System.out.println("OK");
                System.exit(0);
            }
        }
        while(a!=b){
            if(a%k == 0){
                System.out.println("OK");
                System.exit(0);
            }
            a = a+1;
        }
        System.out.println("NG");
    }
}
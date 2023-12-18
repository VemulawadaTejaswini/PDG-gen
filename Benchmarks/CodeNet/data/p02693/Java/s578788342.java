import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b-a < k){
            if(a == b){
                if(a%k == 0){
                    System.out.println("OK");
                    System.exit(0);
                }
                else{
                    System.out.println("NG");
                    System.exit(0);
                }
            }
            System.out.println("NG");
        }
        else{
            System.out.println("OK");
        }
    }
}
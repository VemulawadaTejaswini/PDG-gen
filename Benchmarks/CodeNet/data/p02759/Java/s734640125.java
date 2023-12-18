import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        if(n%2==0){
            num = n/2;
           // System.out.println(n);
        }else{
            num = n/2+1;
        }

        System.out.println(num);
    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int k=scn.nextInt();
        if(k-a>0){
            k-=a;
            if(k-b<=0){
                System.out.println(a);
            }else{
                k-=b;
                System.out.println(a+b-c);
            }
        }else{
            System.out.println(k);
        }
        
    }
}

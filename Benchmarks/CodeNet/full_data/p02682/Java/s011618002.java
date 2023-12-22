import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();
        int x =0;
        if(k<=a){
            System.out.println(k);
        }
        else{
            x=a;
            k-=a;
            if(k<=b){
                System.out.println(x);
            }
            else{
                k-=b;
                
                System.out.println(x+(k*-1));
            }
        }
    }
}
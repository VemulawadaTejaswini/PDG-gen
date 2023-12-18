import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        for(int i = 0; i<k;i++){
            if(n==b && (n+b)==k){
                n=0;
                b=0;
                break;
            }else if(n>0){
            n--;
        }else if(b>0){
            b--;
        }else{

        }
    }
    System.out.println(n+" "+b);

    }
}

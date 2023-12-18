import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h=sc.nextLong();
        long w=sc.nextLong();
        long res1=0,res2=0;
        if(h==1||w==1){
            System.out.println(1);
            return;
        }
        res1=((w+1)/2)*((h+1)/2);
        res2=(w/2)*(h/2);
        System.out.println(res1+res2);
    }
}
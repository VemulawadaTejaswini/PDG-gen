import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        boolean res = true;
        if(c-a-b >= 0){
            if((c-a-b) * (c-a-b) > 4*a*b){
                res = true;
            }else{
                res = false;
            }
        }else{
            res = false;
        }
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}

import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        if ((l<=2019)&&(r<2019)){
            System.out.println(l*(l+1)%2019);
        }else if ((l<=2019)&&(2019<=r)){
            System.out.println(0);
        }else if ((2019<l)&&(r<=2019*2-1)){
            System.out.println(l*(l+1)%2019);
        }else if ((2019<l)&&(2019*2<=r)){
            System.out.println(0);
        }
        
    }
}

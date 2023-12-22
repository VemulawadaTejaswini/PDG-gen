import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        String ans = "No";
        for(int i=0;i<=X;i++){
            if(2 * i + 4 *(X -i) == Y){
                ans = "Yes";
            }
        }
        System.out.println(ans);


    }

}

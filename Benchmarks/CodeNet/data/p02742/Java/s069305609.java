import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt;
        int W = sc.nextInt;
        int S = H * W;
        if(S%2==1){
        System.out.println((S-1)/2+1);
        }else{
        System.out.println(S/2);
        }
    }
}


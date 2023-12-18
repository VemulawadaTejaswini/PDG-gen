import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        System.out.println((N%2==0)?"0.5":(Double)((N/2)+1D)/N);
    }
}

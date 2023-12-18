import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int one = M*1900 + (N-M)*100; //一回でかかる時間

        System.out.println((int)(one * Math.pow(2, M)));
    }
}
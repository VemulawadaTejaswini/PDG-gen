import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        for(int i=1;i<=N/2;i++) if(N-i!=i)num++;
        System.out.println(num);
    }
}

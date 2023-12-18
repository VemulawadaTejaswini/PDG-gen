import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //切り出しする文字列
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> listA = new ArrayList<Integer>();
        int sum = 0;
        if(A >= K){
            System.out.println(K);
        }else if(A + B >= K){
            System.out.println(A);
        }else{
            System.out.println(A - (C - (K - A - B)));
        }
    }
}

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int sum = (L-1) * N + N*(N+1)/2;


        if(L>=0){
            System.out.println(sum-L);
        }else{
            System.out.println(sum-Math.min(L+N-1,0));
        }


    }

}

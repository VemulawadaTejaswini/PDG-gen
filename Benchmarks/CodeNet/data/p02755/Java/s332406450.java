import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int AN = A * 100 / 8;
        int BN = B * 10;

        if(AN == BN){
            System.out.println(AN);
            return;
        }
        int ANN = AN * 8 / 100;
        int BNN = BN / 10; 
        if(ANN == BN && BNN == AN){
            System.out.println(-1);
            return;
        }

        System.out.println(AN);
    }

}

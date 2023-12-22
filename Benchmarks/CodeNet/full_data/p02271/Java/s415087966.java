import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        //input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[20];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] m = new int[200];
        for (int i = 0; i < q; i++) {
            m[i] = scanner.nextInt();
        }

        //search
        for(int i = 0; i < q; i++){
            if(comb(0, A, m[i])){
                System.out.printf("yes\n");
            }
            else{
                System.out.printf("no\n");
            }
        }
    }

    public static boolean comb(int index, int[] A, int p){
        if(p == 0)
            return true;
        if(index >= A.length) return false;
        else{
            if(p < 0)
                return false;
            else{
                return comb(index + 1, A, p) || comb(index + 1, A, p - A[index]);
            }
        }
    }
}


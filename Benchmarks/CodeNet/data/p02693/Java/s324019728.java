import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if((K == 1) || (A % K ==0) || (B % K==0) ){
            System.out.println("Yes");
        } else {
            int aa = A/K;
            if (((aa+1) * K >= A) && ((aa+1) * K <= B)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
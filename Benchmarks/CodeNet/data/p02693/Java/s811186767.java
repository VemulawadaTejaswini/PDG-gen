import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean trueCount = false;
        for(int i = A; i<=B; i++){
            if(i % K == 0){
                trueCount = true;
            }
        }
        System.out.println(trueCount == true ? "OK" : "NG");
    }
}
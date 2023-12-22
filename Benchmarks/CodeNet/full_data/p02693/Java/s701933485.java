import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        Boolean flag = true;
        for(int i = A; i <= B; i++){
            if(i%K==0){
                System.out.print("OK");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.print("NG");
        }
    }
}


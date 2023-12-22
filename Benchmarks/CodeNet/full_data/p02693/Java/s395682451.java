import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int flag = 0;
        for(int i = A;i <= B;i++){
            if(i % 4 == 0){
                flag += 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}

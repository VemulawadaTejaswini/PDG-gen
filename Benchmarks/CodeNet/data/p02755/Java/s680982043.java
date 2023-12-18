import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        float ansA = (float) (A) /0.08f;
        float ansB = (float) (B)/0.10f;
        int aA = (int)(ansA * 0.08);
        int aB = (int) (ansB * 0.10);
        if(aA == aB || ansA ==ansB){
            System.out.println((int) (aA/0.08));
        }else{
            System.out.println(-1);
        }

    }

}

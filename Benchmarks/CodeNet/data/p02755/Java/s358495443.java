import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int caseA = (int) (A/0.08);
        int caseB = (int) (B/0.1);
        if((int) (caseA*0.08) == A && (int) (caseB*0.1)==B){
            System.out.println(caseA);
        }else{
            System.out.println(-1);
        }
    }

}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        stdIn.close();

        int result = Math.max((int)Math.ceil(A * 12.5) + 12, (int)Math.ceil(B * 10) + 10);
        for (int i = 0; i < 13; i ++) {
            for (int j = 0; j < 11; j++) {
                if ((Math.ceil(A * 12.5) + i) == (Math.ceil(B * 10) + j)) {
                    result = Math.min(result,(int)Math.ceil(A * 12.5) + i);
                    break;
                } else {
                    result = -1;
                }
            }
            break;
        } 

        System.out.println(result);
    }
}
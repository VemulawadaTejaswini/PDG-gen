import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        sc.close();

        StringBuffer sb = new StringBuffer();
        sb.append("Christmas");
        for (int i = 0; i < 25 - D; i++){
            sb.append(" Eve");
        }

        System.out.println(sb.toString());
    }

}

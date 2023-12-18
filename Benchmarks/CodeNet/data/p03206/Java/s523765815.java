import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = sc.nextInt();
        int diff = 25-input;
        //FIXME:no sanity check
        StringBuffer sb = new StringBuffer();
        sb.append("Christmas");
        for(int i = 0;i < diff;++i) {
            sb.append(" Eve");
        }
        System.out.println(sb.toString());
    }

}

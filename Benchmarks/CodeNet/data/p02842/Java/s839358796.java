import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = (int)(n / 1.08);
        int tmp2 = (int)(tmp * 1.08);
        if(tmp == tmp2){
            System.out.println(tmp);
        } else {
            System.out.println(":(");
        }
    }
}

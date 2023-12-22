import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int takahasi = Integer.parseInt(str[0]);
        int aoki = Integer.parseInt(str[2]);
        while(true){
            aoki = aoki - Integer.parseInt(str[1]);
            if (aoki <= 0){
                System.out.println("Yes");
                break;
            }
            takahasi = takahasi - Integer.parseInt(str[3]);
            if (takahasi <= 0){
                System.out.println("No");
                break;
            }
        }
    }
}

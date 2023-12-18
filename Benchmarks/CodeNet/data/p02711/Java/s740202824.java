
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] n = String.valueOf(N).toCharArray();
        boolean flag = false;
        for(int i=0;i<n.length;i++){
            if(n[i] == '7'){
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}

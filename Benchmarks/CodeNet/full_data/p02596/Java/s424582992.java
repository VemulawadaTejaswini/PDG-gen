import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        long seven = 0;
        int count = 1;
        if(K % 2 == 0) System.out.println("-1");
        else{
            while(true){
                seven = 10*seven + 7;
                if(seven % K == 0) break;
                count++;
            }
            System.out.println(count);
        }
    }
}
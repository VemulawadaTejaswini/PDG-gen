import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String seven = "";
        int count = 1;
        if(K % 2 == 0) System.out.println("-1");
        else{
            while(true){
                seven += "7";
                int num = Integer.parseInt(seven);
                if(num%K == 0){
                    System.out.println(count);
                    break;
                }else count++;
            }
        }
    }
}
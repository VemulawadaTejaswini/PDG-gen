import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean flag = false;
        for(int i = a; i<=b; i++){
            if(i%k == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("OK");
        } else {
            System.out.println("No");
        }
    }
}
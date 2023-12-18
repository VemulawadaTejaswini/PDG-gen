import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = 1; i <= 100; i++){
            if((int)(i * 0.08) == (int)(i * 0.1)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        scan.close();
    }
}

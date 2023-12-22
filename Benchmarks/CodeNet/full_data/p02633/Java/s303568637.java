import java.util.*;

public class Main {
    public static void main(String[] args) {
        int am = 0;
        int r = 360;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        for(int i = 1;i < 10000; i++){
            am = (r*i)%x;
            if(am == 0){
                System.out.println((r*i)/x);
                i = 10000;
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int am = 1;
    int count = 0;
    int r = 360;
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();

        if(r%x == 0){
            System.out.println(r/x);
        }else{
            while(am != 0){
                am = r%x;
                count += r/x;
                r = r+am;
                if(am == 0){
                    System.out.println(count);
                }
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int am = 0;
    int r = 360;
    int i = 0;
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();

        if(r%x == 0){
            System.out.println(r/x);
        }else{
            am = r%x;
            if(r%am == 0){
                System.out.println(r/am);
            }else{
                i = r/(r%am);
                System.out.println(i*(r/am));
            }
        }
    }
}
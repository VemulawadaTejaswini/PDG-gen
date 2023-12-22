import java.util.*;

public class Main {
    public static void main(String[] args) {
    int am = 0;
    int r = 360;
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();

        if(r%x == 0){
            System.out.println(r/x);
        }else{
            am = r%x;
            System.out.println(r/am);
        }
    }
}
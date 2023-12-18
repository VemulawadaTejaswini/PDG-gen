import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double area = W * H / 2.0;
        int isCenter;
        if(W/2==x && H/2==y){
            isCenter = 1;
        }else{
            isCenter = 0;
        }
        System.out.println(String.format("%f %d", area, isCenter));
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int absx = Math.abs(x);
        int absy = Math.abs(y);
        if(absx > absy){
            if(x > 0 && y>0){
                System.out.println(absx-absy+2);
            }else if (x > 0){
                System.out.println(absx-absy+1);
            }else if(x < 0 && y>0){
                System.out.println(absx-absy+1);
            }else if(x < 0){
                System.out.println(absx-absy);
            }

        }else if(absx < absy){
            if(y > 0 && x>=0){
                System.out.println(absy-absx);
            }else if (y > 0){
                System.out.println(absy-absx+1);
            }else if(y < 0 && x >= 0 ){
                System.out.println(absy-absx+1);
            }else if(y < 0){
                System.out.println(absy-absx+2);
            }
        }else {
            if(x!=y){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}

import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double checkx;
        double x = 0;
        double checky;
        double y = 0;


        for(checkx = 1;checkx <= n;checkx++){
            checky = (double)n/checkx;
            if(x ==0 && y == 0){
                x = checkx;
                y = checky;
            }else if(checky == (int)checky && checkx + checky <  x +y){
                x = checkx;
                y = checky;
            }
        }

        System.out.println(x+y-2);
    }
}
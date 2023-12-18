import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        double W = sc.nextDouble();
        Double H = sc.nextDouble();
        Double x = sc.nextDouble();
        Double y = sc.nextDouble();

        if(x==W/2 && y==H/2){
            System.out.println(W * H / 2 + " " + 1);
        }
        else{
            System.out.println(W * H / 2 + " " + 0);
        }
    }
}

import java.util.*;

public class Main {

    static int[][] AB;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  X = sc.nextInt();


        int ans = 1;
        double x =0;
        double y =0;
        double deg = 0;
        while(true){
//            int rad = (90-X*(ans-1));
            int rad = X*ans;
            if(rad %360==0){
                break;
            }
//            deg = rad* Math.PI/180;
//            x =x -  Math.cos(deg);
//            y =y + Math.sin(deg);
//            if(x==0 && y ==0){
//                break;
//            }
            ans++;
        }
        System.out.println(ans);

    }


}

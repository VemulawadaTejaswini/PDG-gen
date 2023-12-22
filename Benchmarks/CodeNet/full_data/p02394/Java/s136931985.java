import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[]) throws IOException         //?????????
    {
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);                    //?????????
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int tmp_x = x;
        int tmp_y = y;

        if(x > W/2){
            tmp_x = W - x;
        }
        if(y > H/2){
            tmp_y = H - y;
        }
        if((tmp_y < r) || (tmp_x < r)){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
    
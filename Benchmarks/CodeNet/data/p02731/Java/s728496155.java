
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println(maxVolume(scn.nextInt()));
    }
    static int maxVolume(int l){
        return  l/3 * (l- l/3)/2 *(l - l/3 - (l-l/3)/2);

    }


}
// 2 4 6 8 10 12

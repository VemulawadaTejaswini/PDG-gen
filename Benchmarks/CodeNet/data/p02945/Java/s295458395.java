import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int[] nyuuryoku = new int[2];
        nyuuryoku[0] = yomi.nextInt();
        nyuuryoku[1] = yomi.nextInt();
        int[] suuzi = new int[3];
        suuzi[0] = nyuuryoku[0] + nyuuryoku[1];
        suuzi[1] = nyuuryoku[0] - nyuuryoku[1];
        suuzi[2] = nyuuryoku[0] * nyuuryoku[1];
        int max =suuzi[0];
        for (byte i=1;i<3;i++){
            max = Math.max(suuzi[i],max);
        }
        System.out.println(max);
        }

    }

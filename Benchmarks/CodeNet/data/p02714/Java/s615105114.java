
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  s = sc.next();
        char[] rgb = s.toCharArray();
        int countR = 0;
        int countB = 0;
        int countG = 0;
        for (int i = 0; i < rgb.length; i++){
            if('R' == rgb[i])
                countR++;
        }
        for (int i = 0; i < rgb.length; i++){
            if('B' == rgb[i])
                countR++;
        }
        for (int i = 0; i < rgb.length; i++){
            if('G' == rgb[i])
                countR++;
        }
        if (countB == 0 || countG == 0 || countR == 0){
            System.out.println("0");
            return;
        }
        if (countB == 1 || countG == 1 || countR == 1) {
            System.out.println("1");
            return;
        }
        int result = 0;
        for (int i = 0; i < rgb.length; i++){
            for (int j = i + 1; j < rgb.length; j++){
                for (int k = j + 1; k < rgb.length; k++){
                    if (rgb[i] != rgb[j] && rgb[j] != rgb[k] && rgb[k] != rgb[i]){
                        if(j - i != k - j){
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);

    }
}

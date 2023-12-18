import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  s = sc.next();
        char[] rgb = s.toCharArray();
        long countR = 0;
        long countB = 0;
        long countG = 0;
        for (int i = 0; i < rgb.length; i++){
            if('R' == rgb[i])
                countR++;
            if ('B' == rgb[i])
                countB++;
            if ('G' == rgb[i])
                countG++;
        }
        if (countB == 0 || countG == 0 || countR == 0){
            System.out.println("0");
            return;
        }
        int result = 0;
            for (int i = 0; i < rgb.length; i++) {
                for (int j = i + 1; j < rgb.length; j++) {
                    if (rgb[i] == rgb[j]){
                        continue;
                    }
                    for (int k = j + 1; k < rgb.length; k++) {
                        if (k == 2 * j - i)
                            continue;
                        if (rgb[i] != rgb[j] && rgb[j] != rgb[k] && rgb[k] != rgb[i]) {
                            if (j - i != k - j) {
                                result++;
                            }
                        }
                    }
                }
        }
        System.out.println(result);

    }
}

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Weather Prediction
//        String todayWeather = scanner.next();
//        System.out.println(todayWeather.equals("Sunny") ? "Cloudy" : todayWeather.equals("Cloudy") ? "Rainy" : "Sunny");

        // Tap Dance
//        String stepStrng = scanner.next();
//
//        char[] stepChar = new char[stepStrng.length()];
//        for(int i = 0; i < stepStrng.length(); i++){
//            stepChar[i] = stepStrng.charAt(i);
//        }
//
//        boolean easy = true;
//        for (int i = 0; i < stepChar.length; i++) {
//            if (i % 2 == 0 && (stepChar[i] == 'R' || stepChar[i] == 'U' || stepChar[i] == 'D')) {
//                continue;
//            } else if (i % 2 == 1 && (stepChar[i] == 'L' || stepChar[i] == 'U' || stepChar[i] == 'D')) {
//                continue;
//            } else {
//                easy = false;
//            }
//        }
//
//        System.out.println(easy ? "Yes" : "No");

        // Attack Survival
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        Map<Integer, Integer> score = new HashMap<>();
        for (int i =1; i < q; i++) {
            score.put(i, k);
        }

        boolean flag = false;
        for (int i = 1; i < q; i++) {
            int a = scanner.nextInt();
            for(Iterator<Integer> iterator = score.keySet().iterator(); iterator.hasNext(); ) {
                int key = iterator.next();
                int value = score.get(key) - 1;
                if (key != a) {
                    score.put(key, value);
                    if (value == -1) {
                        flag = true;
                    }
                }
            }

            System.out.println(flag ? "Yes" : "No");

        }




    }
}

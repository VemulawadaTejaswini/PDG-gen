import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nos = Arrays.asList( 1, 32, 243, 1024, 3125, 7776, 16807, 32768, 59049, 100000, 161051, 248832, 371293, 537824, 759375, 1048576, 1419857, 1889568, 2476099, 3200000, 4084101, 5153632, 6436343, 7962624, 9765625, 11881376, 14348907, 17210368, 20511149, 24300000, 28629151, 33554432, 39135393, 45435424, 52521875, 60466176, 69343957, 79235168, 90224199, 102400000, 115856201, 130691232, 147008443, 164916224, 184528125, 205962976, 229345007, 254803968, 282475249, 312500000, 345025251, 380204032, 418195493, 459165024, 503284375, 550731776, 601692057, 656356768, 714924299, 777600000, 844596301, 916132832, 992436543);
        List<Integer> temp = new ArrayList<>();
        for (Integer no : nos) {
            temp.add(-no);
        }
        temp.add(0);
        temp.addAll(nos);
        int x = Integer.parseInt(scanner.next());
        for (Integer no : temp) {
            if (temp.contains(no - x)) {
                int b = no - x;
                System.out.println(no < 0 ? ((int)-Math.pow(-no,0.2)) : ((int) Math.pow(no,0.2))+ " " + (b < 0 ? ((int)-Math.pow(-b,0.2)) : ((int) Math.pow(b,0.2))));
                return;
            }
        }
    }

}
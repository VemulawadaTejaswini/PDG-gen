import java.text.ParseException;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern(" y M d")
                .withChronology(JapaneseChronology.INSTANCE);
        while (sc.hasNext()) {
            int[] l = new int[3];
            for (int i = 0; i < 3; i++) {
                l[i] = sc.nextInt();
            }
            if (l[0] >= 1869 && l[0] <= 1872 || l[0] == 1868 && (l[1] >= 10 || l[1] == 9 && l[2] >= 8)) {
                System.out.println("meiji " + (l[0] - 1867) + " " + l[1] + " " + l[2]);
                continue;
            }
            try {
                JapaneseDate jd = JapaneseDate.of(l[0], l[1], l[2]);
                if (jd.getEra() == JapaneseEra.HEISEI) {
                    System.out.println("heisei" + jd.format(f));
                } else if (jd.getEra() == JapaneseEra.SHOWA) {
                    System.out.println("showa" + jd.format(f));
                } else if (jd.getEra() == JapaneseEra.TAISHO) {
                    System.out.println("taisho" + jd.format(f));
                } else if (jd.getEra() == JapaneseEra.MEIJI) {
                    System.out.println("meiji" + jd.format(f));
                }
            } catch (Exception e) {
                System.out.println("pre-meiji");
            }
        }
    }
}

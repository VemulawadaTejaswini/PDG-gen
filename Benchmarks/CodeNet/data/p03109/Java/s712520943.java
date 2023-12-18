import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate date = LocalDate.parse(s, dateTimeFormatter);
            LocalDate date0430 = LocalDate.of(2019, 4, 30);
            if (date.isAfter(date0430)) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
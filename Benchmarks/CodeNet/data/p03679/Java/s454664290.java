import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputDays = br.readLine().split(" ");
            int fineDayBeforeOfbestByDate = Integer.parseInt(inputDays[0]);
            int boughtDayBeforeOfBestByDate = Integer.parseInt(inputDays[1]);
            int ateDayAfterOfBoughtDay = Integer.parseInt(inputDays[2]);
            
            String statusOfFood = "";
            if (boughtDayBeforeOfBestByDate - ateDayAfterOfBoughtDay >= 0) {
                statusOfFood = "delicious";
            } else if (boughtDayBeforeOfBestByDate - ateDayAfterOfBoughtDay + fineDayBeforeOfbestByDate >= 0) {
                statusOfFood = "safe";
            } else {
                statusOfFood = "dangerous";
            }

            System.out.println(statusOfFood);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
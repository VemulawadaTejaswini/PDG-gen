import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int takahashiAge = Integer.parseInt(br.readLine());
            Set<Integer> sevenAndFiveAndThree = new HashSet<>();
            sevenAndFiveAndThree.add(3);
            sevenAndFiveAndThree.add(5);
            sevenAndFiveAndThree.add(7);

            String canCelebrate = "NO";
            if (sevenAndFiveAndThree.contains(takahashiAge)) {
                canCelebrate = "YES";
            }

            System.out.println(canCelebrate);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            char[] input = br.readLine().toCharArray();

            String result = "No";
            if (input[0] == input[1] && input[1] == input[2] || input[1] == input[2] && input[2] == input[3]) {
                result = "Yes";
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    static void swap(List<String> list, int index1, int index2) {
        String tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }
}
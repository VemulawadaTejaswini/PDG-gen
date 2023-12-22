
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String[] columns;
        int ZENKI = 0;
        int KOUKI = 1;
        int SAITEST = 2;
        int count = 0;

        ArrayList<Integer>[] scores = new ArrayList[3];

        scores[ZENKI] = new ArrayList<>();
        scores[KOUKI] = new ArrayList<>();
        scores[SAITEST] = new ArrayList<>();
        while (true) {

            String line = reader.readLine();
            columns = line.split(" ");
            if (Integer.parseInt(columns[ZENKI]) == -1 
             && Integer.parseInt(columns[KOUKI]) == -1
             && Integer.parseInt(columns[SAITEST]) == -1){
                break;
            }
            scores[ZENKI].add(Integer.parseInt(columns[ZENKI]));
            scores[KOUKI].add(Integer.parseInt(columns[KOUKI]));
            scores[SAITEST].add(Integer.parseInt(columns[SAITEST]));
            
            count++;
        }
        for (int i = 0; i < count; i++) {
            if (scores[ZENKI].get(i) == -1 || scores[KOUKI].get(i) == -1 || scores[ZENKI].get(i) + scores[KOUKI].get(i) < 30) {
                builder.append("F");
            }
            else if ((scores[ZENKI].get(i) + scores[KOUKI].get(i)) >= 80) {
                builder.append("A");
            }
            else if (scores[ZENKI].get(i) + scores[KOUKI].get(i) < 80 && scores[ZENKI].get(i) + scores[KOUKI].get(i) >= 65 ) {
                builder.append("B");
            }
            else if (scores[ZENKI].get(i) + scores[KOUKI].get(i) < 65 && scores[ZENKI].get(i) + scores[KOUKI].get(i) >= 50 ) {
                builder.append("C");
            }
            else if (scores[ZENKI].get(i) + scores[KOUKI].get(i) < 50 && scores[ZENKI].get(i) + scores[KOUKI].get(i) >= 30 ) {
                if (scores[SAITEST].get(i) == 50 ) {
                    builder.append("C");
                }
                builder.append("D");
            }
            builder.append("\n");
        }
        System.out.print(builder);
        }
}
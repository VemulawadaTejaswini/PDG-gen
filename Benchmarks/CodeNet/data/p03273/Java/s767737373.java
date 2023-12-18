import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] param = br.readLine().split(" ");
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);

        String[][] array = new String[a][b];
        List<Integer> showColumnsList = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            String line = br.readLine();
            array[i] = line.split("");
        }

        // 縦一列
        for (int i = 0; i < b; i++) {
            boolean allWhite = true;
            for (int j = 0; j < a; j++) {
                if (array[j][i].equals("#")) {
                    allWhite = false;
                    break;
                }
            }
            if (!allWhite) {
                showColumnsList.add(i);
            }
        }

        // 横一列
        for (int i = 0; i < a; i++) {
            boolean allWhite = true;
            for (int j = 0; j < b; j++) {
                if (array[i][j].equals("#")) {
                    allWhite = false;
                    break;
                }
            }
            if (!allWhite) {
            	for (int j: showColumnsList) {
                	out.print(array[i][j]);
            	}
            	out.println();
            }  
        }
        out.close();
    }
}
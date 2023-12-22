import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------

        String  line= f.readLine();

        String[] theLine = line.split(" ");
        ArrayList<Integer> theInts = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(f.readLine());
        for(int i = 0; i < Integer.parseInt(theLine[0]); i++)
        {

            theInts.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(theInts);

        int sum = 0;
        for(int g = 0; g < Integer.parseInt(theLine[1]); g++)
        {
            sum+=theInts.get(g);
        }

        out.print(sum);


        out.close();
    }
}
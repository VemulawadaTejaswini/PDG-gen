import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lst = line.split(" ");
        int n = Integer.parseInt(lst[0]);
        int l = Integer.parseInt(lst[1]);

        List<String> strArr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            line = br.readLine();
            strArr.add(line);
        }

        Collections.sort(strArr);
        for(int i = 0; i < strArr.size(); i++){
            System.out.print(strArr.get(i));
        }
        System.out.println();


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String ars[]){
        int n, tmp, ave;
        String line;
        int score[] = new int[100];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while((line = reader.readLine()) != null){
                ave = 0;
                n = Integer.parseInt(line);
                for(int i = 0; i < n; i++) score[i] = Integer.parseInt(reader.readLine());
                for(int i = 0; i < n; i++) {
                    for (int j = n - 1; j > i; j--) {
                        if (score[j] < score[j - 1]) {
                            tmp = score[j - 1];
                            score[j - 1] = score[j];
                            score[j] = tmp;
                        }
                    }
                }
                for(int i = 1; i < n-1; i++) ave += score[i];
                ave /= n-2;
                System.out.println(ave);
            }
        }catch(IOException e){
            System.exit(0);
        }
    }
}
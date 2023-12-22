import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(br.readLine());
            List<String> items = new ArrayList<>();
            int result = 0;
            for(int i = 0; i<number;i++){
                String now = br.readLine();
                if(items.contains(now)==false){
                    result++;
                }
                items.add(now);
            }
            System.out.print(result);
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

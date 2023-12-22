import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            int v = 0;
            ArrayList<Integer> array = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                array.add(Integer.parseInt(br.readLine()));
            }
            int max = array.get(1) - array.get(0);
            for(int i = 0 ; i < n ; i++){
                for(int count = 0 ; count < i ; count++){
                    v = array.get(i) - array.get(count);
                    if(v > max){
                        max = v;
                    }
                }
            }
            System.out.println(max);

        }
        catch(Exception e){
            System.err.println(e);
        }


    }
}
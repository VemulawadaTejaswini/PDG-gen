import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int[] A = Arrays.stream(getContents().get(1).split(" ")).mapToInt(Integer::parseInt).toArray();
        int len = A.length;
        int sw = 0;
        boolean flag = true;
        for(int i = 0; flag; ++i){
            flag = false;
            for(int j = len - 1;  j >= i + 1; --j){
                if(A[j] < A[j - 1]){
                    int v = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = v;
                    flag = true;
                    ++sw;
                }
            }
        }
        System.out.println(String.join(" ", Arrays.stream(A).mapToObj(String::valueOf).toArray(String[]::new)));
        System.out.println(String.valueOf(sw));
    }
    
    public static ArrayList<String> getContents() throws IOException{
        String line;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) list.add(line);
        
        return list;
    }
}

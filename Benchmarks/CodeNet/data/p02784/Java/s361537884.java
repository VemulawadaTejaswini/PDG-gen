import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();
        String line2 = input.readLine();

        String[] h1 = line1.split(" ");
        int[] h2 = Arrays.stream(h1).mapToInt(Integer::parseInt).toArray();

        String[] s1 = line2.split(" ");
        int sum = Arrays.stream(s1).mapToInt(Integer::parseInt).sum();
 
        if(h2[0] > sum){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
}


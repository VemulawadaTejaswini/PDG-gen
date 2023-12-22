import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int time = Integer.parseInt(br.readLine());
        long sum = 0;
        int max = -1000000;
        int min = 1000000;
        int num[] = new int[time];
        String[] ary = br.readLine().split(" ");
        
        for (int i = 0; i < time; i++) {
            num[i] = Integer.parseInt(ary[i]);
            sum += num[i];
            if (max < num[i]) {
                max = num[i];
            }
            
            if (min > num[i]) {
                min = num[i];
            }
        }
        
        System.out.println(min + " " + max + " " + sum);
        
    }
}
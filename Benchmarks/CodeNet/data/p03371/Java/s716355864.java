import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int x = Integer.parseInt(line[3]);
        int y = Integer.parseInt(line[4]);
        long price, minPrice = a * x + b * y;
        
        for (int i = 2; i <= Math.max(x, y)*2; i += 2) {
            price = a * Math.max(0, (x - i/2)) + b * Math.max(0, (y - i/2)) + c * i;
            if (price < minPrice) {
                minPrice = price;
            }
        }
        
        
        
        
        System.out.println(minPrice);
    }
}

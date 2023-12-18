import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] number = line.split(" ");
        int[] n = {Integer.parseInt(number[0]), Integer.parseInt(number[1])};
        int b1;
        int b2;
        int b3;
        int max;
        int min;
        if(n[0] % 3 == 0 || n[1] % 3 == 0){
            System.out.println("0");
        } else if(n[0] % 2 == 1 && n[0] % 2 == 1 && Math.pow(n[0], 2) > Math.pow(n[1], 2) || Math.pow(n[1], 2) > Math.pow(n[0], 2)){
            System.out.println(Math.min(n[0], n[1]));
        } else {
            int r1;
            int r2;
            b1 = ((((n[0] - n[0] % 3) / 3) * 2) + 1) * ((n[1] - n[1] % 2) / 2);
            b2 = ((((n[0] - n[0] % 3) / 3) * 2) + 1) * (((n[1] - n[1] % 2) / 2) + (n[1] % 2));
            b3 = (n[0] * n[1]) - b1 - b2;
            max = Math.max(b2, b3);
            min = Math.min(b1, b3);
            r1 = Math.abs(max - min);
            b1 = ((((n[1] - n[1] % 3) / 3) * 2) + 1) * ((n[0] - n[0] % 2) / 2);
            b2 = ((((n[1] - n[1] % 3) / 3) * 2) + 1) * (((n[0] - n[0] % 2) / 2) + (n[0] % 2));
            b3 = (n[0] * n[1]) - b1 - b2;
            max = Math.max(b2, b3);
            min = Math.min(b1, b3);
            r2 = Math.abs(max - min);
            if(r1 <= r2){
                System.out.println(r1);
            } else {
                System.out.println(r2);
            }
        }
	}
}
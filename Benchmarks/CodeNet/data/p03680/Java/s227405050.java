import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] buttons = new int[n+1];
        int[] selected = new int[n+1];
        
        for (int i = 1; i <= n ;i++) {
            buttons[i] = Integer.parseInt(br.readLine());
            selected[i] = 0;
        }
        
        int ans = 0;
        boolean possible = false;
        int index = 1;
        
        
        
        while (selected[index] == 0) {
            ans++;
            if (buttons[index] == 2) {
                possible = true;
                break;
            }
            selected[index] = 1;
            index = buttons[index];
        }
        System.out.println(possible?ans:-1);
    }
}

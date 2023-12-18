import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        int n = Integer.parseInt(lines[0]);
        double[] x = new double[n];
        String[] u = new String[n];
        
        double ans = 0;
        double ans1 = 0;
        double ans2 = 0;
        
        for(int i=0; i<n; i++){
            String[] input = lines[i+1].split(" ");
            x[i] = Double.parseDouble(input[0]);
            u[i] = input[1];
            
            if (u[i].equals("BTC")){
                ans1 += 380000*x[i];
            }
            else if(u[i].equals("JPY")){
                ans2 += x[i]; 
            }
        }
        System.out.println(ans1+ans2);
    }
    
    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }
}
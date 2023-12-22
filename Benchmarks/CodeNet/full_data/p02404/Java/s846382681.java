import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String symbol = "#";
        String dot = ".";
        
        while (true) {
            String[] ary = br.readLine().split(" ");
            int numH = Integer.parseInt(ary[0]);
            int numW = Integer.parseInt(ary[1]);
            
            if(numH == 0 && numW == 0){
                break;
            }
            
            for (int i = 0; i < numH; i++) {
                for (int j = 0; j < numW; j++) {
                    if (i == 0 || i == (numH - 1)) {
                        sb.append(symbol);
                    } else if (j == 0 || j == (numW - 1)) {
                        sb.append(symbol);
                    } else if (numW > 2 && numH > 2){
                        sb.append(dot);
                    } else {
                        sb.append(symbol);
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
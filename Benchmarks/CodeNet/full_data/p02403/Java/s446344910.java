import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String Symbol = "#";
        
        while (true) {
            String[] ary = br.readLine().split(" ");
            int numH = Integer.parseInt(ary[0]);
            int numW = Integer.parseInt(ary[1]);
            
            if(numH == 0 && numW == 0){
                break;
            }
            
            for (int i = 0; i < numW; i++) {
                for (int j = 0; j < numH; j++) {
                    sb.append(Symbol);
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
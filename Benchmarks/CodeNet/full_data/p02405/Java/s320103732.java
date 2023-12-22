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
            
            Rectangle rt = new Rectangle(numH, numW);
            System.out.print(rt.makeCheck(symbol, dot));
        }
        
        System.out.print(sb);
    }
}

class Rectangle {
    private int hight;
    private int wide;
    
    Rectangle(int hight, int wide){
        this.hight = hight;
        this.wide = wide;
    }
    
    String makeFrame(String symbol, String dot) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < wide; j++) {
                if (i == 0 || i == (hight - 1) || j == 0 || j == (wide - 1)) {
                    sb.append(symbol);
                } else {
                    sb.append(dot);
                }
            }
            sb.append("\n");
        }
        sb.append("\n");
        
        return sb.toString();
    }
    
    String makeRectangle(String symbol){
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < wide; j++) {
                sb.append(symbol);
            }
            sb.append("\n");
        }
        sb.append("\n");
        
        return sb.toString();
    }
    
    String makeCheck (String symbol, String dot) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < wide; j++) {
                if (j % 2 == 0 && i % 2 == 0) {
                    sb.append(symbol);
                } else if (j % 2 == 1 && i % 2 == 1) {
                    sb.append(symbol);
                } else {
                    sb.append(dot);
                }
            }
            sb.append("\n");
        }
        sb.append("\n");
        
        return sb.toString();
    }
}
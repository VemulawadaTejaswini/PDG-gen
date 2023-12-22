import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String planes = "";
        int row = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.next();
            planes += str;
            if(row++ > 6){
                row = 0;
                if(planes.matches(".*1111.*"))System.out.println("C");
                if(planes.matches(".*110000011.*"))System.out.println("G");
                if(planes.matches(".*1100000011.*"))System.out.println("A");
                if(planes.matches(".*11000000011.*"))System.out.println("E");
                if(planes.matches(".*1000000110000001.*"))System.out.println("F");
                if(planes.matches(".*100000001100000001.*"))System.out.println("D");
                if(planes.matches(".*1000000010000000100000001.*"))System.out.println("B");
                planes = "";
            }
        }
    }
}


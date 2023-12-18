import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        int startPoint = 0;
        int endPoint = n;
        int halfPoint = n;
        int minCount = n;
        int first = 0;
        int latter = 0;
        int full = 0;
        while(true) {
            first = 0;
            latter = 0;
            full = 0;
            for(int i = startPoint; i < halfPoint; i++) {
                if(s[i] == '#') first++;
            }
            for(int i = halfPoint; i < endPoint; i++) {
                if(s[i] == '.') latter++;
            }
            for(int i = 0; i < halfPoint; i++){
                if(s[i] == '#') full++;
            }
            for (int i = halfPoint; i < n; i++) {
                if(s[i] == '.') full++;
            }
            if(minCount > full) minCount = full;
            if(first > latter) {
                endPoint = halfPoint;
                halfPoint = (startPoint + endPoint) / 2;
            } else {
                startPoint = halfPoint;
                halfPoint = (startPoint + endPoint) / 2;
            }
            if(startPoint == halfPoint) break;
        }
        System.out.println(minCount);
    }
}

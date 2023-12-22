import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++) {
            String[] line = br.readLine().split(" ");
            List<Integer> list = new ArrayList<Integer>();
            list.add(new Integer(line[0]));
            list.add(new Integer(line[1]));
            list.add(new Integer(line[2]));
            Collections.sort(list);
            double cor = Math.sqrt(Math.pow(list.get(0).doubleValue(),2) + Math.pow(list.get(1).doubleValue(),2)); 
            double ex  = list.get(2).doubleValue();
            if(cor == ex) System.out.println("YES");
            else  System.out.println("NO");
        }
    }
}
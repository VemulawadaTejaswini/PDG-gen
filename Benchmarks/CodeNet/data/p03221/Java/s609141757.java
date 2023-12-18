import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lineString = br.readLine().split(" ");
        int M = Integer.valueOf(lineString[1]);
        
        Map<Integer, List<Integer>> orgMap = new HashMap<Integer, List<Integer>>();
        
        String[] cityYear = null;
        int[][] count = new int[M][2];
        int area = 0;
        int city = 0;
        for (int i = 0; i < M; i++) {
            cityYear = br.readLine().split(" ");
            area = Integer.valueOf(cityYear[0]);
            city = Integer.valueOf(cityYear[1]);
            
            if (!orgMap.containsKey(area)) {
                orgMap.put(area, new ArrayList<Integer>());
            }
            orgMap.get(area).add(city);
            count[i][0] = area;
            count[i][1] = city;
        }
        
        List<Integer> citys = null;
        Map<Integer, Map<Integer, String>> sortMap = new HashMap<Integer, Map<Integer, String>>();
        for (Integer key : orgMap.keySet()) {
            citys = orgMap.get(key);
            Collections.sort(citys);
            
            if (!sortMap.containsKey(key)) {
                sortMap.put(key, new HashMap<Integer,String>());
            }
            
            for (int i = 1; i <= citys.size(); i++) {
                sortMap.get(key).put(citys.get(i - 1), getId(String.valueOf(i)));
            }
        }
        orgMap.clear();
        for (int i = 0; i < M; i++) {
            String temp = getId(String.valueOf(count[i][0]));
            System.out.println(temp + sortMap.get(count[i][0]).get(count[i][1]));
        }
        
    }
    
    private static String getId(String v){
        String result = "";
        for (int i = 0; i < 6 - v.length(); i++) {
            result += "0";
        }
        return result += v;
    }
}

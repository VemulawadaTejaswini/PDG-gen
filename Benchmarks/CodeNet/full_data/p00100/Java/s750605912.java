import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer,Long> map = new HashMap<Integer,Long>();

        String input;

        while((input = br.readLine()) != null){
            int n = Integer.parseInt(input);
            if(n == 0) break;
            
            map.clear();
            for(int i = 0; i < n; i++){
                String[] line = br.readLine().split(" ");
                int shine = Integer.parseInt(line[0]);
                if(map.containsKey(shine)){
                    if(map.get(shine) + (long)Integer.parseInt(line[1]) * Integer.parseInt(line[2]) >= 0){
                        map.put(shine, map.get(shine) + (long)Integer.parseInt(line[1]) * Integer.parseInt(line[2]));
                    }else{
                        map.put(shine, Long.MAX_VALUE);
                    }
                }else{
                    map.put(shine, (long)Integer.parseInt(line[1]) * Integer.parseInt(line[2]));
                }
            }

            boolean be = false;
            Object[] mapkey = map.keySet().toArray();
            Arrays.sort(mapkey);

            for(Object x : mapkey){
                if(map.get(x) >= 1000000){
                    System.out.println(x);
                    be = true;
                }
            }

            if(!be){
                System.out.println("NA");
            }

        }
    }
}

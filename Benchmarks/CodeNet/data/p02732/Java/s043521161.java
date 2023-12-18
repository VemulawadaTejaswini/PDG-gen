import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] a = input.readLine().split(" ");
        List<String> list = Arrays.asList(a);
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.merge(s, 1, Integer::sum);
        }
//        System.out.println(map);
        int count = 0;
        for(Integer val : map.values()){
            if(val.intValue()>1){
                int cul = val.intValue();
                count = count + (cul * (cul - 1))/2;
//                System.out.println("count=" + count);
            }
        }
        for(int i=0;i<n;i++){
            String s = list.get(i);
//            System.out.println("map=" + map.get(s).intValue());
            if(map.get(s).intValue()==1){
                System.out.println(count);
            }else if(map.get(s).intValue()==2){
                System.out.println(count-1);
            }else{
                int sub = map.get(s).intValue();
//                System.out.println("sub="+ ((sub-1) * (sub-2))/2);
                int ans = count - (sub * (sub-1))/2 + ((sub-1) * (sub-2)/2);
                System.out.println(ans);
            }
        }
    } 
}
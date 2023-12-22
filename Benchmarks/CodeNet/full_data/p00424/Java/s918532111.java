import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        Integer cnt = -9;
        boolean bit2 = false;
        Map<String, String> mapping = new HashMap<>();
        List<String> inputs = new ArrayList<>();
        while ((line = br.readLine().trim()) != null && !line.isEmpty()) {
            int len = line.split(" ").length;
            if(len == 1) {
                if(bit2) {
                    cnt = Integer.parseInt(line);
                    bit2 = false;
                    continue;
                }
                inputs.add(line);
                cnt--;
                if(cnt==0){
                    output(inputs.subList(1,inputs.size()), mapping);
                    inputs.clear();
                    mapping.clear();
                    cnt = -9;
                    continue;
                }
                if(cnt <=0 && "0".equals(line)) break;
            }
            if(len == 2) {
                List<String> tmp = Arrays.stream(line.split(" ")).collect(Collectors.toList());
                mapping.put(tmp.get(0), tmp.get(1));
                bit2 = true;
            }
        }
    }

    public static void output(List<String> inputs, Map<String, String> mapping) {
        StringBuffer bf = new StringBuffer();
        inputs.forEach(s->bf.append(mapping.get(s) != null ? mapping.get(s) : s));
        System.out.println(bf.toString());
    }
}
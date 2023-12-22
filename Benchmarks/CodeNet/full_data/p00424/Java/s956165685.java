import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        Integer cnt = 0;
        boolean bit2 = false;
        Map<String, String> mapping = new HashMap<>();
        List<String> inputs = new ArrayList<>();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int len = line.split(" ").length;
            if(len == 1) {
                if(bit2) {
                    cnt = Integer.parseInt(line.trim());
                    bit2 = false;
                    continue;
                }
                if(cnt==0){
                    output(inputs, mapping);
                    inputs.clear();
                    mapping.clear();
                    continue;
                }
                inputs.add(line.trim());
                cnt--;
                if(cnt <=0 && "0".equals(line)) break;
            }
            if(len == 2) {
                List<String> tmp = Arrays.stream(line.split(" ")).collect(Collectors.toList());
                mapping.put(tmp.get(0).trim(), tmp.get(1).trim());
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
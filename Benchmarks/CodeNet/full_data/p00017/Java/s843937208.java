import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> cache = new HashMap<String, String>();

        final byte _the[] = {0x74, 0x68, 0x65};
        final byte _this[] = {0x74, 0x68, 0x69, 0x73};
        final byte _that[] = {0x74, 0x68, 0x61, 0x74};

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            if(cache.containsKey(line)) {
                System.out.println(cache.get(line));
                continue;
            }

            byte[] target = line.getBytes();
            int length = target.length;
            int matchPos = -1;

            for(int i=0; i <= length-4; i++) {
                byte[] check3 = {target[i], target[i+1], target[i+2]};
                byte[] check4 = {target[i], target[i+1], target[i+2], target[i+3]};

                if(isMatch.test(check3, _the) || isMatch.test(check4, _this) || isMatch.test(check4, _that)) {
                    matchPos = i;
                }
            }
            if(matchPos == -1) {
                matchPos = length - 3;
            }

            int diff = target[matchPos] - 0x74;
            StringBuffer bf = new StringBuffer();
            for(int i=0; i <= length-1; i++) {
                if(0x61 <= target[i] && target[i] <= 0x7A)
                    bf.append((char)(target[i]-diff));
                else
                    bf.append((char)(target[i]));
            }
            cache.put(line, bf.toString());
            System.out.println(cache.get(line));
        }
    }

    public static BiPredicate<byte[], byte[]> isMatch = (target, check) -> {
        int length = check.length;
        int diff = check[0] - target[0];
        return IntStream.range(0,length).allMatch(i->{return diff==(check[i]-target[i]);});
    };
}
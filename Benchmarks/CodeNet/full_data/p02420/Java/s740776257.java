import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String word = br.readLine();
            if ("-".equals(word)) {
                break;
            }

            int num = Integer.parseInt(br.readLine());
            String after_shuffle_word = word;
            for (int i = 0; i < num; i++) {
                int shuffle_num = Integer.parseInt(br.readLine());
                after_shuffle_word = shuffle(after_shuffle_word, shuffle_num);
            }
            
            System.out.println(after_shuffle_word);
        }
    }
    
    private static String shuffle(String word, int shuffle_num) {
        String pre_word = word.substring(0, shuffle_num);
        String post_word = word.substring(shuffle_num);
        return post_word + pre_word;
    }
}


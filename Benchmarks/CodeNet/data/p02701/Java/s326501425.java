import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        boolean flg = true;
        List<String> texts = new ArrayList<>();
        int count = Integer.parseInt(sc.next());

        for(int i = 0; i < count; i++) {
            text = sc.next();
            for(String item : texts) {
                if(text.contains(item)) {
                    flg = false;
                }
            }
            if(flg) {
                texts.add(text);
            }
        }
        System.out.print(texts.size());
    }
}
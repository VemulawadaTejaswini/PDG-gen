
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = "";
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
        	word = sc.next();
        	if(!list.contains(word)) {
        		list.add(word);
        }
		}
        System.out.println(list.size());
    }
}


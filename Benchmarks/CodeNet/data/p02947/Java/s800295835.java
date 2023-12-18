import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List<String> strList = new ArrayList<>();
        for(int i=0; i<num; i++) {
            strList.add(sc.nextLine());
        }
        check(num, strList);
    }

    public static void check(int num, List<String> strList) {
        int cnt = 0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                if(i==j) {
                    continue;
                }
                if(anaglam(strList.get(i), strList.get(j))) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }


    static boolean anaglam(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[256]; //文字コードの仮定;

        char[] s_array = s.toCharArray();
        for(char c:s_array){
            letters[c]++;
        }

        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }
}
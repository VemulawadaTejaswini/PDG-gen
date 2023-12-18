import java.util.*;

class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] pat1 = { "keyence", "k",      "ke",    "key",  "keye", "keyen", "keyenc" };
        String[] pat2 = { "",        "eyence", "yence", "ence", "nce",  "ce",    "e"};

        boolean flg = true;

        for(int i = 0; i < 7; i++){
            String tmp_str = str;
            int position1 = tmp_str.indexOf(pat1[i]);
            if(position1 >= 0){
                tmp_str = tmp_str.substring(position1, tmp_str.length());
                int position2 = tmp_str.indexOf(pat2[i]);
                if(position2 >= 0){
                    System.out.println("YES");
                    flg = false;
                    break;
                }
            }
        }
        if(flg){
            System.out.println("NO");
        }
    }
}
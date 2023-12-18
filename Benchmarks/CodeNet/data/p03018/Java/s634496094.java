import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String s = sc.next();
        sc.close();
        s = s.replace("BC", "D");
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        int counter = 0;
        int i = 0;

        if (s.length() < 2) {
            counter = 0;
        } else {
            while(check(sb)){
            while (sb.length() - 1 > i) {
                if (sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'D') {
                    sb.replace(i, i + 2, "DA");
                    counter++;
                    if(i>1){
                        if(sb.charAt(i-1)=='A'){
                            sb.replace(i-1, i + 1, "DA");
                            counter++;
                        }
                    }
                }
                i++;
            }
            i=0;
        }
        }

        // 出力
        System.out.println(counter);
    }

    public static boolean check(StringBuilder sb){
        String s = sb.toString();
        s = s.replace("AD", "E");
       // System.out.println(sb);
       // System.out.println(s);
        for(int i=0;i<s.length();i++){
        if (s.charAt(i)=='E') {
            return true;
        }
    }
        return false;
    }

}

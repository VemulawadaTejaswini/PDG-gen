import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int changed = 0;


        for (int i = 0; i < n-1; i++) {
            if (!s.contains("#") || !s.contains(".")) {
                break;
            } else if (s.contains("#.") && s.indexOf("#.") == s.lastIndexOf("#.")) {
                if ((s.indexOf("#.")+1) > s.length()/2){
                    changed=s.length()-(s.indexOf("#.")+1);
                }else{
                    changed=(s.indexOf("#.")+1);
                    }
                break;
            } else if (String.valueOf(s.charAt(i)).equals("#") && String.valueOf(s.charAt(i+1)).equals(".")) {
                // 境界より前
                String s1 = s.substring(0, i);
                // 後ろ
                String s2 = s.substring(i+1);

                int dotCnt = 0;
                int sharpCnt = 0;

                for (int j = 0; j < s1.length(); j++) {
                    if (String.valueOf(s1.charAt(j)).equals("#")) {
                        sharpCnt++;
                    }
                }
                for (int j = 0; j < s2.length(); j++) {
                    if (String.valueOf(s2.charAt(j)).equals(".")) {
                        dotCnt++;
                    }
                }
                if (changed == 0 || changed > sharpCnt + dotCnt) {
                    changed = sharpCnt + dotCnt;
                }
            }
        }

        System.out.println(changed);
        sc.close();
    }
}
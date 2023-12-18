import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int t = 0;
        boolean start = false;
        for (int i = 0; i < s.length(); i++) {
            String b = s.substring(i, i+1);
            int tmp = t;
            if(b.equals("A")) t++;
            if(b.equals("T")) t++;
            if(b.equals("C")) t++;
            if(b.equals("G")) t++;
            if(!start) start = true;
            else if(start && t == tmp){
                ans = Math.max(ans, t);
                t = 0;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}

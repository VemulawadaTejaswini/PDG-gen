import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        int res = 0;
        char chars[] = s.toCharArray();
        for(int i=1; i<s.length(); i++){
            String former = s.substring(0, i);
            String latter = s.substring(i);
            int tmp = 0;
            for (int k=0; k<former.length(); k++){
                int c = former.charAt(k);
                if (former.indexOf(c)==k && latter.indexOf(c)!=-1){
                    tmp++;
                }
            }
            res = Math.max(res, tmp);
        }
        System.out.println(res);
    }

}
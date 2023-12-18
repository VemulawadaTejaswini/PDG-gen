import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int dotCnt = 0;
        int sharpCnt = 0;


        if (s.indexOf("#") != -1 && s.indexOf(".")!= -1) {
            String sMid = s.substring(s.indexOf("#"), s.lastIndexOf(".") + 1);
            System.out.println(sMid);
            for (int i = 0; i < sMid.length(); i++) {
                String str = String.valueOf(s.charAt(i));

                if (str.equals(".")) {
                    dotCnt++;
                } else {
                    sharpCnt++;
                }
            }
        }

        if (dotCnt <= sharpCnt){
            System.out.println(dotCnt);
        }else{
            System.out.println(sharpCnt);
        }


        sc.close();
    }
}
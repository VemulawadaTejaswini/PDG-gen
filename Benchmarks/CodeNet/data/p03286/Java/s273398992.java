import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.println(getBaseMinus2Number(N));

    }

    private static String getBaseMinus2Number(int n) {
        if(n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = n < 0 ? 1 : 0;
        int c = 0;
        int i = 0;
        while(true){
            c = (int) Math.pow(-2, i * 2 + b);
            a += c;
            if(Math.abs(n) <= Math.abs(a)){
                int len = i * 2 + b + 1;
                sb.append(1);
                if(len > 1){
                    String s = getBaseMinus2Number(n - c);
                    for(int j = 0; j < len - s.length() -1; j++) sb.append(0);
                    sb.append(s);
                }
                break;
            }
            i++;
        }
        return sb.toString();
    }

}

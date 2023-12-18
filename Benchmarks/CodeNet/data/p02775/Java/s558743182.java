import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String N = sc.next();
        System.out.println(sum(N));

    }

    private static long sum(String N){
        int keta = N.charAt(N.length()-1)-'0';
        if(N.length() == 1){
            if(keta <= 5){return keta;}
            else{return 11-keta;}
        }
        if(keta <= 5){
            return keta + sum(N.substring(0, N.length()-1));
        }else{
            return (10-keta) + sum(add(N.substring(0, N.length()-1)));
        }
    }
    private static String add(String N){
        //if(N.length() == 0){return "1";}
        char[] c = N.toCharArray();
        int i=c.length-1;
        if(c[i] <= '8'){
            c[i]++;
            return new String(c);
        }
        while(i >= 0 && c[i] == '9'){
            c[i] = '0';
            i--;
        }
        if(i == -1){
            StringBuilder bld = new StringBuilder();
            bld.append('1');
            bld.append(new String(c));
            return bld.toString();
            //さいごに1
        }else{
            c[i]++;
            return new String(c);
        }
    }
}

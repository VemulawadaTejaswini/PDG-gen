import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro_p = 0;
        int hanako_p = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            String taro = sc.next();
            String hanako = sc.next();
            if (taro.length() == hanako.length()) { 
                s = taro.length();
            } else if (taro.length() < hanako.length()) {
                s = taro.length();
            } else {
                s = hanako.length();
            }
            for (int j = 0; j < s; j++) {
                if (taro.equals(hanako)) {
                    taro_p += 1;
                    hanako_p += 1;
                    break;
                } else if ((s - 1 == j && taro.charAt(j) == hanako.charAt(j) && taro.length() > hanako.length()) || taro.charAt(j) > hanako.charAt(j)) {
                    taro_p += 3;
                    break;
                } else if ((s - 1 == j &&  taro.charAt(j) == hanako.charAt(j) && taro.length() < hanako.length()) || taro.charAt(j) < hanako.charAt(j)) {
                    hanako_p += 3;
                    break;
                } else {
                   
                }
            }    
        }
        System.out.println(taro_p + " " + hanako_p);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro_p = 0;
        int hanako_p = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String taro = sc.next();
            String hanako = sc.next();
            for (int j = 0; j < taro.length(); j++) {
                if (taro.charAt(j) > hanako.charAt(j)) {
                    taro_p += 3;
                    break;
                } else if (taro.charAt(j) < hanako.charAt(j)) {
                    hanako_p += 3;
                    break;
                }else if (cnt == j) {
                    taro_p += 1;
                    hanako_p += 1;
                } else {
                    cnt++;
                }
            }
        }
    System.out.println(taro_p+" "+hanako_p);
    }
}
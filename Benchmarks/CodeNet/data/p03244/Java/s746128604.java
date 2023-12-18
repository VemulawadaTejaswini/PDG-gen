import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
        String hoge = sc.nextLine();
        String[] b = sc.nextLine().split(" ");

        int base =Integer.parseInt(b[0]);
        int base2 =Integer.parseInt(b[1]);
        int ct = 0;
        for(int i=2; i < b.length; i++) {
            if (i%2 == 0) {
                if (base != Integer.parseInt(b[i])) {
                    ct++;
                }
            } else {
                if (base2 != Integer.parseInt(b[i])) {
                    ct++;
                }
            }
        }
        System.out.println(ct);
	}
}
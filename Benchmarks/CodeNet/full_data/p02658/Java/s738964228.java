import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.next());
        int y = 0;
        try {
            for (int i = 0; i < cnt; i++){
                if (i == 0){
                    y = Integer.parseInt(sc.next());
                } else {
                    y *= Integer.parseInt(sc.next());
                }
            }
            System.out.println(y);
        } catch(Exception e){
            System.out.println(-1);
        }

        sc.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
//        System.out.println("args:" + args[0]);

        Scanner sc;
        String line;

//        System.out.println("入力：A種類の冷蔵庫　B種類のレンジ　M種類の割引券");
        sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] data_abm = line.split(" ");

//        System.out.println("入力：冷蔵庫");
        sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] data_a = line.split(" ");

//        System.out.println("入力：レンジ");
        sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] data_b = line.split(" ");

//        System.out.println("入力：割引券");
        ArrayList<String> data_m = new ArrayList<String>();
        for(int i=0;i<Integer.parseInt(data_abm[2]);i++) {
            sc = new Scanner(System.in);
            line = sc.nextLine();
            data_m.add(line);
        }

        // 計算
        int a = Integer.parseInt(data_a[0]);
        int b = Integer.parseInt(data_b[0]);
        int m = 0;
        int ret = a + b;

        for(int i=0;i < data_m.size();i++) {
            String[] d = data_m.get(i).split(" ");
            a = Integer.parseInt(data_a[Integer.parseInt(d[0]) - 1]);
            b = Integer.parseInt(data_b[Integer.parseInt(d[1]) - 1]);
            m = Integer.parseInt(d[2]);

            if(ret > a+b-m){
                ret = a + b - m;
            }
        }

        System.out.println(ret);
    }
}

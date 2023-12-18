import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc;
        String line;

        sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] data_abm = line.split(" ");

        sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] data_a = line.split(" ");

        sc = new Scanner(System.in);
        line = sc.nextLine();
        String[] data_b = line.split(" ");

        ArrayList<String> data_m = new ArrayList<String>();
        for(int i=0;i<Integer.parseInt(data_abm[2]);i++) {
            sc = new Scanner(System.in);
            line = sc.nextLine();
            data_m.add(line);
        }

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

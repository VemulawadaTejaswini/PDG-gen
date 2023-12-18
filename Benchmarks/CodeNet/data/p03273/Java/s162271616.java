import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] arr = new char[h+1][w+1];

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }

        List<char[]> list = new ArrayList<>();

        for (int i=0; i<h; i++) {
            int cnt = 0;
            for (int j=0; j<w; j++) {
                if (arr[i][j] == '.') cnt++;
            }
            if (cnt != w) {
                char[] tmp = arr[i];
                list.add(tmp);
            }
        }

//        System.out.println(list);

        char[][] s = new char[list.size()][w];

        for (int i=0; i<list.size(); i++) {
            s[i] = list.get(i);
        }

        List<char[]> list1 = new ArrayList<>();

        for (int i=0; i<w; i++) {
            int cnt = 0;
            for (int j=0; j<list.size(); j++) {
                if (arr[j][i] == '.') cnt++;
            }
            if (cnt != list.size()) {
                char[] c = new char[list.size()];
                for (int k=0; k<list.size(); k++) {
                    c[k] = s[k][i];
                }
                list1.add(c);
            }

        }

//        System.out.println(list1);

        for (int i=0; i<list1.get(0).length; i++) {
//            System.out.println(list1.get(0)[i]);
        }

        char[][] res = new char[list1.get(0).length][list1.size()];

//        System.out.println(list1.get(0).length);
//        System.out.println(list1.size());

        for (int i=0; i<list1.size(); i++) {
            for (int j=0; j<list1.get(0).length; j++) {
                res[j][i] = list1.get(i)[j];
            }
        }

        for (int i=0; i<res.length; i++) {
            for (int j=0; j<res[0].length-1; j++) {
                sb.append(res[i][j]);
            }
            sb.append(res[i][res[0].length-1] + "\n");
        }

        System.out.println(sb.toString());




    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> S = new ArrayList<String>();
        ArrayList<String> P = new ArrayList<String>();
        for (int i=0; i<N; i++) {
            S.add(sc.next() + "," + sc.next() + "," + (i+1));
        }
        S.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] o1s =  o1.split(",");
                String[] o2s =  o2.split(",");
                if (o1s[0].compareTo(o2s[0]) == 0) {
                    int n1 = Integer.parseInt(o1s[1]);
                    int n2 = Integer.parseInt(o2s[1]);
                    return Integer.compare(n2, n1);
                }
                else {
                    return o1s[0].compareTo(o2s[0]);
                }
            }
        });
        for (int i=0; i<N; i++) {
            String[] index =  S.get(i).split(",");
            System.out.println(index[2]);
        }

    }
}

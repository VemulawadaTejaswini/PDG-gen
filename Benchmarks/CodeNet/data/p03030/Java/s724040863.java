import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Restaurant[] rs = new Restaurant[n];
        for(int i=0; i<n; i++) {
            Restaurant r = new Restaurant();
            r.name = in.next();
            r.score = in.nextInt();
            r.index = i+1;
            rs[i] = r;
        }
        Arrays.sort(rs);
        for(int i=0; i<n; i++) {
            System.out.println(rs[i].index);
        }
    }
}
class Restaurant implements Comparable<Restaurant>{
    String name;
    int score;
    int index;

    @Override
    public int compareTo(Restaurant o) {
        if(!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        return o.score - this.score;
    }
}

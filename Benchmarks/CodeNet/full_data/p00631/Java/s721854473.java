import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = 0; i < n; i++) {
                    list.add(scn.nextInt());
                }
                Collections.sort(list);
                Collections.reverse(list);

                int p = 0;
                int g = 0;
                for(int elm : list) {
                    if(p < g) {
                        p += elm;
                    } else {
                        g += elm;
                    }
                }

                System.out.println(Math.max(p, g) - Math.min(p, g));
            }
        }
    }
}
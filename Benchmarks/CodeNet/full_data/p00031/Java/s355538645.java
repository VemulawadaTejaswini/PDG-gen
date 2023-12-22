import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            while(sc.hasNext()) {
                int w = sc.nextInt();
                List<Integer> list = new ArrayList<Integer>();
                for(int i=0; i<10; i++) {
                    if((w & 1<<i) != 0) list.add(1<<i);
                }
                boolean jud = true;
                for(int i:list) {
                    if(!jud) System.out.print(" ");
                    jud = false;
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}


import java.util.Scanner;
import java.util.HashSet;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        int N = in.nextInt();
        
        while (N != 0) {
            String str = in.next();
            if (str.equals("insert")) {
                set.add(in.next());
                N--;
            } else if (str.equals("find")) {
                if (set.contains(in.next())) { System.out.println("yes"); }
                else                         { System.out.println("no"); }
                N--;
            } else                            System.out.println("error");
        }
    }
}
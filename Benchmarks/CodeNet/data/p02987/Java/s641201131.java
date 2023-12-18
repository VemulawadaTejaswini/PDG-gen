import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        char one = line.charAt(0);
        char two = line.charAt(1);
        char three = line.charAt(2);
        char four = line.charAt(3);

        Set<Character> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        if(set.size() != 2){
            System.out.println("No");
            System.exit(0);
        }

        int c = one == two ? 1 : 0;
        c += one == three ? 1 : 0;
        c += one == four ? 1 : 0;
        if(c != 1){
            System.out.println("No");
            System.exit(0);
        }

        System.out.println("Yes");
    }

}


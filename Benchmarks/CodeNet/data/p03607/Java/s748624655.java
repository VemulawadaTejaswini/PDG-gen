import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            if(list.contains(a)) list.remove(new Integer(a));
            else list.add(a);
            
        }
        System.out.println(list.size());
    }
}

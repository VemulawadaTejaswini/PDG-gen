import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int beforeSize = a.length();
        List<Integer> list = new ArrayList<>();
        for (char c : a.toCharArray()) {
            list.add((int) c);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) != list.get(i + 1)){
                list.remove(i);
                list.remove(i);
                i = -1;
            }
        }
        System.out.println(beforeSize - list.size());
    }
}

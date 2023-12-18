import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextString().split(" ");
        List<Integer> list = new ArrayList<>();
        for(String s : in){
            int i = Integer.parseInt(s);
            if(!list.contains(i))
                list.add(i);
        }
        System.out.println(list.length());
    }
}
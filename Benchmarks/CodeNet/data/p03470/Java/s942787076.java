import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(new HashSet<Integer>());
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        for (int i=0;i<N;i++) {
        	list.add(Integer.parseInt(sc.next()));
        }
        System.out.println(list.size());
    }
}
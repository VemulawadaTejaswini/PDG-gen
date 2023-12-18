import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        List<Integer> listA = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(scanner.next()));
        }

        for(int i = 0; i< listA.size(); i++) {
            ArrayList<Integer> listB = new ArrayList<>(listA);
            listA.remove(i);
            Collections.sort(listA);
            System.out.println(listA.get(listA.size()-1));
            listA = new ArrayList<>(listB);
        }

    }
}
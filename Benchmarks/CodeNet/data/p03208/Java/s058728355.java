import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i =0;i < n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int min=Integer.MAX_VALUE;
        for(int i=0;i < n-k+1;i++){
            min = Math.min(min, list.get(i+k-1)-list.get(i));
        }
        System.out.println(min);

    }
}
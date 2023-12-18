import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i=0;i<n;i++){
            p.add(scanner.nextInt());
        }
        int count = 0;
        for (int i=0;i<n-1;i++){
            if (Collections.min(p.subList(0,i+1))>=p.get(i)){
                count++;
            }
        }
        if (Collections.min(p)>=p.get(n-1)){
            count++;
        }
        System.out.println(count);
    }

}
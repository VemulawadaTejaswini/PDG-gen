import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        ArrayList<Integer> b = new ArrayList<>();
        for (int i=0;i<n;i++){
            b.add(a.get(i)-1);
            b.add(a.get(i));
            b.add(a.get(i)+1);
        }
        int max = 0;
        for (int i:new LinkedHashSet<>(b)){
            int count = 0;
            for (int j:b){
                if (i==j){
                    count++;
                }
            }
            if (count>max){
                max = count;
            }
        }
        System.out.println(max);
    }

}
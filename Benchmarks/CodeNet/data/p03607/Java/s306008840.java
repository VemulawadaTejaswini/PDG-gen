import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i=0;i<n;i++){
            number.add(scanner.nextInt());
        }
        int count = 0;
        for (int i:new LinkedHashSet<>(number)){
            int instance = 0;
            for (int j=0;j<n;j++){
                if (i==number.get(j)){
                    instance++;
                }
            }
            if (instance%2==1){
                count++;
            }
        }
        System.out.println(count);

    }

}
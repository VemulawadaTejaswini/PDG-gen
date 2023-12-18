import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i=0;i<n;i++){
            p.add(scanner.nextInt());
        }
        int count = n;
        boolean b;
        for (int i=1;i<n+1;i++){
            b = true;
            for (int j=1;j<=i&&b;j++){
                if (p.get(i-1)>p.get(j-1)){
                    count--;
                    b = false;
                }
            }
        }
        System.out.println(count);


    }

}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();
        for (int i=0;i<m;i++){
            L.add(scanner.nextInt());
            R.add(scanner.nextInt());
        }
        int l = Collections.max(L);
        int r = Collections.min(R);

        if (l>r){
            System.out.println(0);
        }else {
            System.out.println(r-l+1);
        }

    }

}
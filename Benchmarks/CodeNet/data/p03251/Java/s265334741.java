import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Integer[] xList = new Integer[n];
        Integer[] yList = new Integer[m];
        for(int i = 0;i < n;i++) xList[i] = scanner.nextInt();
        for(int j = 0;j < m;j++) yList[j] = scanner.nextInt();
        Arrays.sort(xList, Collections.reverseOrder());
        Arrays.sort(yList);
        boolean war = true;
        for(int z = x + 1;z <= y;z++) if(xList[0] < z&&yList[0] >= z) war = false;
        if(war){
            System.out.println("War");
        }else{
            System.out.println("No War");
        }
    }
}
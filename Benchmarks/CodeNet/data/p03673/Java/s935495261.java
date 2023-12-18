import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            numList.add(scan.nextInt());
            Collections.reverse(numList);
        }
        
        for(int i = 0; i < numList.size(); i++) {
            if(i != numList.size()-1) System.out.print(numList.get(i) + " ");
            else System.out.println(numList.get(i));
        }
    }
}

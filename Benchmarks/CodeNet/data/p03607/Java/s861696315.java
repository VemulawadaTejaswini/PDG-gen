import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<String> numberList = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            String A = scan.next();
            if(numberList.contains(A)) numberList.remove(A);
            else numberList.add(A);
        }
        
        System.out.println(numberList.size());
    }
}

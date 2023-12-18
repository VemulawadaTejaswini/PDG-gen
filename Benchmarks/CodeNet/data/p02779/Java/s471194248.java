import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list =  new ArrayList<>();
            
        for (int i = 0; i < N; i++){
            int value = sc.nextInt();
            
            if (list.contains(value)){
                System.out.println("NO");;
                return;
            }
            
            list.add(value);
        }
        
        System.out.println("YES");
    }
}

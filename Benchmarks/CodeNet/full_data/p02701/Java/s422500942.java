import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = 0;
        N = sc.nextInt();
        Set<String> tempSet = new HashSet<String>();
        
        for(int i=0;i<N;i++){
            tempSet.add(sc.next());
        }
    System.out.println(tempSet.size()); 
}
}
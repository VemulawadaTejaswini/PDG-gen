import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String P[] = new String[N];
        List<String> A = new ArrayList<String>();
        for(int i = 0 ; i < N ; i++){
            P[i] = sc.nextLine();
            if(!A.contains(P[i])){
                A.add(P[i]);
            }
        }
        System.out.println(A.size()); 
        sc.close();
    }
}
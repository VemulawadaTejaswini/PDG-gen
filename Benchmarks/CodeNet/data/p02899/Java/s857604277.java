import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> idorder = new HashMap<>();
        for(int i=1; i<=N; i++){ 
            int A = scanner.nextInt();
            idorder.put(A, i);
        }
        String out = "";
        for(int i=1; i<=N; i++){
            out = out + String.valueOf(idorder.get(i));
            if(i!=N+1){
                out = out + " ";
            }
        }
        System.out.println(out);
    }
}
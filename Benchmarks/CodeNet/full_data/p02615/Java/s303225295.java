import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int anc = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i < H;i++){
            int B = sc.nextInt();
            result.add(B);
            Collections.sort(result);
            int A = result.get(0);
            anc += A;
        }
        System.out.println(anc);
    }
}

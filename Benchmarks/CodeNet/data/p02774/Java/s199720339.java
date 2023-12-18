import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] temp = new int[N];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            temp[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                list.add(temp[i] * temp[j]);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(K));
    }
}
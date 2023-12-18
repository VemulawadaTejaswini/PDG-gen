import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int total = 0;
        int cnt = 0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++){
            array.add(sc.nextInt());
        }
        for (int i = 0; i < array.size(); i++){
            total += array.get(i);
        } 
        
        for (int i = 0; i < N; i++){
            if (array.get(i) >= total / (4 * M)) {
                cnt++;
            }
        }
        if (cnt >= M) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}

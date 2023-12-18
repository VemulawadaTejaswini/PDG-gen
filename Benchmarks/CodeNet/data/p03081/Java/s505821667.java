import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int[] board = new int[n];
        for(int i = 0;i < n;i++){
            board[i] = 1;
        }

        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            char key = s.charAt(i);
            List<Integer> list = map.containsKey(key) ? map.get(key) : new ArrayList<>();
            list.add(i);
            map.put(key, list);
        }

        int sum = 0;
        for (int i = 0;i < q;i++){
            char key = sc.next().charAt(0);
            int move = sc.next().charAt(0) == 'R' ? 1 : -1;

            if(!map.containsKey(key)) continue;
            List<Integer> list = map.get(key);
            for(int index : list){
                if(index == 0 && move == -1){
                    sum += board[0];
                } else if(index == n-1 && move == 1){
                    sum += board[n-1];
                } else {
                    board[index + move] += board[index];
                }
                board[index] = 0;
            }
        }
        System.out.println(n-sum);
    }
}

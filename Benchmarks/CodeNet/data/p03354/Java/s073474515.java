import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int M  = sc.nextInt();


        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            num.add(sc.nextInt());
        }

        List<Set<Integer>> swap = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int hitX = -1;
            for (int j = 0; j < swap.size(); j++) {
                if(swap.get(j).contains(x)){
                    hitX = j;
                    break;
                }
            }

            int hitY = -1;
            for (int j = 0; j < swap.size(); j++) {
                if(swap.get(j).contains(y)){
                    hitY = j;
                    break;
                }
            }

            if(hitX != -1 && hitY != -1){
                for(Integer tmp : swap.remove(hitY)) {
                    swap.get(hitX).add(tmp);
                }
                continue;
            }

            if(hitX != -1 && hitY == -1){
                swap.get(hitX).add(y);
                continue;
            }

            if(hitX == -1 && hitY != -1){
                swap.get(hitY).add(x);
                continue;
            }

            swap.add(new HashSet<>(Arrays.asList(x, y)));
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            if(num.get(i) == i + 1){
                count++;
                continue;
            }

            for(Set<Integer> set : swap){
                if(set.contains(num.get(i)) && set.contains(num.get(num.get(i) - 1))){
                    count++;
                    continue;
                }
            }
        }
        System.out.println(count);

    }
}

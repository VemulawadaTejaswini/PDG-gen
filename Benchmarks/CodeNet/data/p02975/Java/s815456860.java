import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(map.containsKey(a[i]))
                map.put(a[i], map.get(a[i])+1);
            else
                map.put(a[i], 1);
        }
        sc.close();

        if(map.size() == 1 && a[0] == 0){
            System.out.println("Yes");
            return;
        }
        if(N % 3 == 0){
        if(map.size() == 2){
            int count = 0;
            int x = 0;
            for(Integer key: map.keySet()){
                if(key == 0){
                    if(map.get(key) == N/3)
                        count++;
                } else {
                    if(map.get(key) == 2*N/3){
                        if(x == 0){
                            count++;
                        }
                        x++;
                    }
                }
            }
            if(count == 2){
                System.out.println("Yes");
                return;
            }
        }

        if(map.size() == 3){
            int cnt = 0;
            int sum = 0;
            for(Integer key: map.keySet()){
                sum ^= key;
                if(map.get(key) == N/3)
                    cnt++;
            }
            if(cnt == 3 && sum == 0){
                System.out.println("Yes");
                return;
            }
        }
        }

        System.out.println("No");

    }
}
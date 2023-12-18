import java.util.*;
import java.util.stream.*;
import java.io.*;


class Monster implements Comparable<Monster> {
    final long x, h;

    Monster(long x, long h){
        this.x = x;
        this.h = h;
    }

    public int compareTo(Monster m){
        return Long.compare(this.x, m.x);
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        long N = Long.parseLong(in1[0]);
        long D = Long.parseLong(in1[1]);
        long A = Long.parseLong(in1[2]);
        List<Monster> monsters = new ArrayList<>();
        for(int i = 0; i < N; i++){
            in1 = br.readLine().split(" ");
            long X = Long.parseLong(in1[0]);
            long H = Long.parseLong(in1[1]);
            monsters.add(new Monster(X, H));
        }
        br.close();

        Collections.sort(monsters);
        Queue<long[]> position = new ArrayDeque<>();
        long tmp_attack_count = 0L;
        long total_attack_count = 0L;

        for(int n = 0; n < N; n++){

            long now_x = monsters.get(n).x;
            long now_h = monsters.get(n).h;

            while(!position.isEmpty() && position.peek()[0] + 2 * D < now_x){
                tmp_attack_count -= position.poll()[1];
            }

            long attack_count = (now_h - tmp_attack_count * A + A - 1L) / A;
            if(attack_count <= 0) continue;

            total_attack_count += attack_count;
            tmp_attack_count += attack_count;
            position.add(new long[] {now_x, attack_count});
        }

        System.out.println(total_attack_count);
    }
}
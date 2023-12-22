import java.util.*;

public class Main {
    static List<Room> lr;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        lr = new ArrayList<>(N+1);
        for(int t=0; t<=N; t++) {
            Room r = new Room(t);
            lr.add(r);
        }
        for(int i=1; i<=M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            lr.get(A).connectTo(B);
            lr.get(B).connectTo(A);
        }
        lr.get(1).setSirube(0, 1);
//        for(Room r : lr) {
//            System.out.printf("id:%d, sirube:%d, steps:%s\n", r.index, r.sirube, r.steps);
//        }
        System.out.println("Yes");
        for(int i=2; i<=N; i++) {
            System.out.println(lr.get(i).sirube);
        }
    }

    static class Room {
        int index;
        int sirube = -1;
        int steps = Integer.MAX_VALUE;

        List<Integer> connected = new ArrayList<>();
        Room(int i) {
            this.index = i;
        }

        void connectTo(int target) {
            connected.add(target);
        }

        void setSirube(int sirubeKouho, int steps) {
            if(steps > this.steps) return;
            if(steps == this.steps) {
                if(sirubeKouho >= this.sirube) return;
            }
            this.sirube = sirubeKouho;
            this.steps = steps;
            for(int i : connected) {
                lr.get(i).setSirube(this.index, steps+1);
            }
        }
    }
}

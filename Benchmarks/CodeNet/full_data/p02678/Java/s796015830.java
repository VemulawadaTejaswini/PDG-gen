import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Room[] room = new Room[n + 1];
        for (int i = 0; i < room.length; i++) {
            room[i] = new Room(i);
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to   = sc.nextInt();

            room[from].addRoom(to);
            room[to].addRoom(from);
        }

        room[1].sign = 1;

        mark(room);

        System.out.println("yes");
        for (int i = 2; i < room.length; i++) {
            System.out.println(room[i].sign);
        }
    }

    private static void mark(Room[] room) {
        Queue<Room> queue = new LinkedList<>();

        queue.add(room[1]);

        while (!queue.isEmpty()) {
            Room r = queue.poll();

            for (Integer roomNo : r.rooms) {
                if (room[roomNo.intValue()].sign == -1) {
                    room[roomNo.intValue()].sign = r.no;
                    queue.add(room[roomNo.intValue()]);
                }
            }
        }
    }
}

class Room {
    /** 部屋番号 */
    public int no;
    /** 繋がっている部屋 */
    public Set<Integer> rooms;
    /** 繋がっている部屋の数 */
    public int size = 0;
    /** 最適な移動部屋 */
    public int sign = -1;

    public Room(int no) {
        this.no = no;
        this.rooms = new HashSet<Integer>();
    }

    public void addRoom(int no) {
        rooms.add(Integer.valueOf(no));
    }
}
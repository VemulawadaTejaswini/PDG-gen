import java.util.*;

public class Main{

    static class Room{
        int num;
        Map<Integer, Room> joint = new HashMap<>();
        int mark = -1;
        Room(int num){
            this.num = num;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Room> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i + 1, new Room(i + 1));
        }

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            map.get(a).joint.put(b, map.get(b));
            map.get(b).joint.put(a, map.get(a));
        }

        ArrayDeque<Room> q = new ArrayDeque<>();

        q.add(map.get(1));

        while(!q.isEmpty()){
            Room room = q.poll();

            for(Room i : room.joint.values()){
                if(i.mark == -1){
                    i.mark = room.num;
                    q.add(i);
                }
            }
        }

        map.remove(1);

        StringBuilder sb = new StringBuilder();
        sb.append("Yes\n");

        for(Room i : map.values()){
            if(i.mark != -1){
                sb.append(i.mark).append("\n");
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println(sb);

    }
}

import java.util.Arrays;
import java.util.Scanner;
 
public class Main{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[][] r = new Player[3][8];
        for(int i=0;i<3;i++){
            for(int j=0;j<8;j++){r[i][j]=new Player(sc.nextInt(),sc.nextDouble());}
        }
        for(int i=0;i<3;i++){
        Arrays.sort(r[i]);
        }
        Player[] winner = new Player[6];
        int x = 0;
        for(int i=0;i<3;i++){
            System.out.printf("%d %.2f\n", r[i][0].id, r[i][0].time);
            System.out.printf("%d %.2f\n", r[i][1].id, r[i][1].time);
            winner[x++] = r[i][2];
            winner[x++] = r[i][3];
        }
        Arrays.sort(winner);
        System.out.printf("%d %.2f\n", winner[0].id, winner[0].time);
        System.out.printf("%d %.2f\n", winner[1].id, winner[1].time);
    }
    static class Player implements Comparable<Player>{
        int id;
        double time;
        public Player(int id, double time) {
            this.id = id;
            this.time = time;
        }
        public int compareTo(Player o) {
            return time-o.time<0?-1:o.time-time<0?1:0;
        }
    }
 
}	
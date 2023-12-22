import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            int building, floor, room, value;
            String line;
            House house = new House();
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                building = Integer.parseInt(st.nextToken());
                floor = Integer.parseInt(st.nextToken());
                room = Integer.parseInt(st.nextToken());
                value = Integer.parseInt(st.nextToken());
                house.addInhabitant(building,floor,room,value);
            }
            house.showInhabitant();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class House {
    private int[][][] inhabitant;

    House() {
        inhabitant = new int[4][3][10];
    }

    void addInhabitant(int building, int floor, int room, int value) {
        inhabitant[building - 1][floor - 1][room - 1] += value;
    }

    void showInhabitant(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < 10; k++) {
                    sb.append(" ").append(inhabitant[i][j][k]);
                }
                System.out.println(sb.toString());
            }
            if(i<3) {
                System.out.println("####################");
            }
        }
    }
}
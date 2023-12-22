import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Building[] building=new Building[4];
        for(int i=0;i<4;i++){
            building[i]=new Building();
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            building[b-1].floor[f-1].room[r-1]+=v;
        }
        for(int i=0;i<3;i++){
            building[i].show();
            System.out.println("####################");
        }building[3].show();

    }

}

class Building {

    Floor[] floor = new Floor[3];

    Building() {
        for (int i = 0; i < 3; i++) {
            floor[i] = new Floor();
        }
    }
    
    void show(){
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(" "+this.floor[i].room[j]);
            }System.out.println();
        }
    }
    
}

class Floor {

    int[] room = new int[10];

    Floor() {
        Arrays.fill(room, 0);
    }
}
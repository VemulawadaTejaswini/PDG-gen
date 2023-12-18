
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] uf = new int[N];
        Arrays.fill(uf,-1);

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int z = sc.nextInt();

            connect(x,y,uf);

        }

        int count =0;
        for(int leader : uf) if(leader==-1) count++;
        System.out.println(count);
    }

    static    private int findLeader(int i ,int[] uf){
        if (uf[i] ==-1) return i;
        int leader = findLeader(uf[i], uf);
        uf[i] = leader;
        return leader;
    }
    static  private void connect(int i ,int j, int[] uf){
        int leader1 = findLeader(i,uf);
        int leader2 = findLeader(j,uf);
        if(leader1 == leader2) return;

        if(leader1 < leader2){
            uf[leader2] = leader1;
        }


    }
}
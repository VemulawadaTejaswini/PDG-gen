import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int[] mincost = new int[10];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < 10;++i){
            mincost[i] = Integer.MAX_VALUE;
        }
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int cost[][] = new int[10][10];
        int wall[][] = new int[w][h];
        for (int i = 0;i < 100;++i){
            cost[i / 10][i % 10] = scanner.nextInt();
        }
        for (int i = 0;i < h * w;++i){
            wall[i % w][i / w] = scanner.nextInt();
        }
        int costsnumarray[] = new int[10];
        for (int y = 0;y < h;++y){
            for (int x = 0;x < w;++x){
                if(wall[x][y] == -1){
                    continue;
                }
                ++costsnumarray[wall[x][y]];
            }
        }
        for (int i = 0;i < 10;++i){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(i);
            search(cost, arrayList, 0);
        }
        int lastcost = 0;
        for (int i = 0;i < 10;++i){
            if(i == 1){
                continue;
            }
            lastcost += mincost[i] * costsnumarray[i];
        }
        System.out.println(lastcost);
    }

    public static void search(int costarray[][],ArrayList<Integer> root,int cost){
        for (int i = 0;i < 10;++i){
            boolean flag = false;
            for (int k:root){
                if(k == i){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            int last = root.get(root.size() - 1);
            if(i == 1){
                int start = root.get(0);
                int newcost = cost + costarray[last][i];
                if(newcost < mincost[start]){
                    mincost[start] = newcost;
                }
            }
            else{
                ArrayList<Integer> newarray = new ArrayList<>();
                for (int c = 0;c < root.size();++c){
                    newarray.add(root.get(c));
                }
                newarray.add(i);
                int newcost = cost + costarray[last][i];
                search(costarray, newarray, newcost);
            }
        }
    }


}
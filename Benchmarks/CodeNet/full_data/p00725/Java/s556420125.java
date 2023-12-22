import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class data{
    public int[][] map;
    public int x, y, count;
    data(){
        count = 0;
    }
    data(int[][] a, int xx, int yy, int counts){
        map = a;
        x = xx;
        y = yy;
        count = counts;
    }
} 

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int flag=0, i=0, j=0, goal=0, x=0, y=0;
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(h==0 && w==0) break;
            data start = new data();
            start.map = new int[h][w];
            for(i=0;i<h;i++){
                for(j=0;j<w;j++){
                    start.map[i][j] = sc.nextInt();
                    if(start.map[i][j]==2){
                        start.x = j;
                        start.y = i;
                    }
                }
            }
            Queue<data> queue = new LinkedList<data>();
            queue.add(start);
            while(!queue.isEmpty()){
                flag = 0;
                data search = queue.remove();
                if(search.count==10) continue;
                int[][] m = search.map;
                if(search.x != 0){
                    for(i=search.x;i>=0;i--){
                        if(search.map[search.y][i]==3){
                            goal = 1;
                            search.count++;
                            break;
                        }
                        if(search.map[search.y][i]==1){
                            flag = 1;
                            break;
                        }
                        if(i==0) break;
                    }
                    if(goal == 1){
                        System.out.println(search.count);
                        break;
                    }
                    if(flag == 1 && search.x != (i+1)){
                        search.map[search.y][i]=0;
                        queue.add(new data(search.map, i+1, search.y, search.count+1));
                        search.map = m;
                    }
                }
                if(search.x != w-1){
                    for(i=search.x;i<w;i++){
                        if(search.map[search.y][i]==3){
                            goal = 1;
                            search.count++;
                            break;
                        }
                        if(search.map[search.y][i]==1){
                            flag = 1;
                            break;
                        }
                        if(i==w-1) break;
                    }
                    if(goal == 1){
                        System.out.println(search.count);
                        break;
                    }
                    if(flag == 1 && search.x != (i-1)){
                        search.map[search.y][i]=0;
                        queue.add(new data(search.map, i-1, search.y, search.count+1));
                        search.map = m;
                    }
                }
                if(search.y != 0){
                    for(i=search.y;i>=0;i--){
                        if(search.map[i][search.x]==3){
                            goal = 1;
                            search.count++;
                            break;
                        }
                        if(search.map[i][search.x]==1){
                            flag = 1;
                            break;
                        }
                        if(i==0) break;
                    }
                    if(goal == 1){
                        System.out.println(search.count);
                        break;
                    }
                    if(flag == 1 && search.y != (i+1)){
                        search.map[i][search.x]=0;
                        queue.add(new data(search.map, search.x, i+1, search.count+1));
                        search.map = m;
                    }
                }
                if(search.y != h-1){
                    for(i=search.y;i<h;i++){
                        if(search.map[i][search.x]==3){
                            goal = 1;
                            search.count++;
                            break;
                        }
                        if(search.map[i][search.x]==1){
                            flag = 1;
                            break;
                        }
                        if(i==h-1) break;
                    }
                    if(goal == 1){
                        System.out.println(search.count);
                        break;
                    }
                    if(flag == 1 && search.y != (i-1)){
                        search.map[i][search.x]=0;
                        queue.add(new data(search.map, search.x, i-1, search.count+1));
                        search.map = m;
                    }
                }
            }
            if(goal != 1) System.out.println("-1");
            while(!queue.isEmpty()) queue.remove();
        }
    }
}

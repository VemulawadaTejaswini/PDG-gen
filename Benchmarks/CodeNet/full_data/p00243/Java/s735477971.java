import java.util.*;
 
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        new AOJ0243().doIt();
    }
 
    class AOJ0243{
        int w,h;
        char[][] map;
        char[][] work;
        int sx[]={1,0,-1,0};
        int sy[]={0,1,0,-1};
        void input(String a){
            int num = 0;
            for(int i=0;i<h;i++)for(int s=0;s<w;s++){
                map[i][s] = a.charAt(num);num++;
            }
        }
 
        void push(int x,int y,char color){
            if(map[y][x] != map[0][0])return;
            work[y][x] = color;
            for(int i=0;i<4;i++){
                int nx = x+sx[i];
                int ny = y+sy[i];
                if(nx<0||nx>=w||ny<0||ny>=h)continue;
                if(map[ny][nx]!=map[0][0])continue;
                if(work[ny][nx]!=map[ny][nx])continue;
                push(nx, ny, color);
            }
        }
 
        boolean isGoal(){
            char a = map[0][0];
            for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(a!=map[i][s])return false;
            return true;
        }
 
        void print(char[][] a){
            for(int i=0;i<h;i++){
                for(int s=0;s<w;s++)System.out.print(a[i][s]);
                System.out.println();
            }
        }
        
        String toMapString(char[][] a){
        	String result = "";
        	for(int i=0;i<h;i++)for(int s=0;s<w;s++)result += a[i][s];
        	return result;
        }
 
        void solved(){
            LinkedList<State> q = new LinkedList<State>();
            q.add(new State(map, 0));
            HashSet<String> set = new HashSet<String>();
            set.add(toMapString(map));
            int result = -1;
            while(!q.isEmpty()){
//            	System.out.println("---------------------");
                State now = q.remove();
                input(now.field);
//                print(map);
                if(isGoal()){
                    result = now.cost;break;
                }
                if(map[0][0]!='R'){
                    work = new char[h][w];
                    for(int i=0;i<h;i++)for(int s=0;s<w;s++)work[i][s] = map[i][s];
                    push(0, 0, 'R');
                    String nexts = toMapString(work);
                    if(set.contains(nexts))continue;
                    set.add(nexts);
                    q.add(new State(work, now.cost+1));
                }
                input(now.field);
                if(map[0][0]!='G'){
                    work = new char[h][w];
                    for(int i=0;i<h;i++)for(int s=0;s<w;s++)work[i][s] = map[i][s];
                    push(0, 0, 'G');
                    String nexts = toMapString(work);
                    if(set.contains(nexts))continue;
                    set.add(nexts);
                    q.add(new State(work, now.cost+1));
                }
                input(now.field);
                if(map[0][0]!='B'){
                    work = new char[h][w];
                    for(int i=0;i<h;i++)for(int s=0;s<w;s++)work[i][s] = map[i][s];
                    push(0, 0, 'B');
                    String nexts = toMapString(work);
                    if(set.contains(nexts))continue;
                    set.add(nexts);
                    q.add(new State(work, now.cost+1));
                }
            }
            System.out.println(result);
        }
 
        void doIt(){
            while(in.hasNext()){
                w = in.nextInt();
                h = in.nextInt();
                if(w+h==0)break;
                map = new char[h][w];
                for(int i=0;i<h;i++)for(int s=0;s<w;s++)map[i][s] = in.next().charAt(0);
                solved();
            }
        }
 
        class State{
            String field;
            int cost;
            public State(char[][] map,int cost){
                field = "";
                for(int i=0;i<h;i++)for(int s=0;s<w;s++)field += map[i][s];
                this.cost = cost;
            }
        }
 
    }
 
}
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        new AOJ2402().doIt();
    }
    class AOJ2402{
        int n,m,l;
        ArrayList<ArrayList<Line2D>> stars;
        double[][] cost;
        int INF = Integer.MAX_VALUE/2;
        void makeLine(int x,int y,int a,int r){
            stars.add(new ArrayList<Line2D>());
            Point2D[] p = new Point2D[5];
            int angle = -a;
            for(int i=0;i<5;i++){
                Robot robot = new Robot(x, y ,angle);
                robot.fd(r);
                p[i] = robot.toPoint();
                //   System.out.println(p[i]);
                angle+=72;
            }
            stars.get(stars.size()-1).add(new Line2D.Double(p[0],p[2]));
            stars.get(stars.size()-1).add(new Line2D.Double(p[2],p[4]));
            stars.get(stars.size()-1).add(new Line2D.Double(p[1],p[4]));
            stars.get(stars.size()-1).add(new Line2D.Double(p[1],p[3]));
            stars.get(stars.size()-1).add(new Line2D.Double(p[0],p[3]));
//            for(int i=0;i<5;i++){
//                Point2D p1 = p[i];
//                Point2D p2 = p[(i+1)%5];
//                Line2D l = new Line2D.Double(p1, p2);
//                stars.get(stars.size()-1).add(l);
//            }
            //   for(int i=0;i<stars.get(stars.size()-1).size();i++){
            //   System.out.println(stars.get(stars.size()-1).get(i).getP1()+" "+stars.get(stars.size()-1).get(i).getP2());
            //   }
        }
        void input(){
            for(int i=0;i<n;i++)makeLine(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        void getMin(){
            for(int i=0;i<n;i++)for(int s=i;s<n;s++){
                if(s==i){
                    cost[i][s]=cost[s][i]=0;continue;
                }
                double min = INF;
                for(int k=0;k<5;k++)for(int j=0;j<5;j++){
                    min = Math.min(min, segSegDist(stars.get(i).get(k),stars.get(s).get(j)));
                }
                cost[i][s] = cost[s][i] = min;
            }
        }
 
        void solve(){
            stars = new ArrayList<ArrayList<Line2D>>();//★の線
            input();
            cost = new double[n][n];
            for(int i=0;i<n;i++)Arrays.fill(cost[i], INF);
            getMin();
//          for(int i=0;i<n;i++){
//              for(int s=0;s<n;s++)System.out.print(cost[i][s]+" ");
//              System.out.println();
//          }
            PriorityQueue<State> q = new PriorityQueue<State>();
            q.add(new State(m,0.0));
            double memo[] = new double[n];
            memo[m]=0.0;
            double result = -1;
            Arrays.fill(memo, INF);
            while(q.size()>0){
                State now = q.remove();
//              System.out.println(now.v+" "+now.cost);
                int v = now.v;
                double c = now.cost;
                if(v==l){
                    result = c;
                    break;
                }
                for(int i=0;i<n;i++)if(cost[v][i]!=INF){
                    double ncost = c+cost[v][i];
                    if(memo[i] <= ncost)continue;
                    memo[i] = ncost;
//                  System.out.println(v+" "+i+" "+ncost);
                    q.add(new State(i, ncost));
                }
            }
            System.out.printf("%.15f\n",result);
        }
        void doIt(){
            while(in.hasNext()){
                n = in.nextInt();
                m = in.nextInt();
                l =in.nextInt();
                if(n+m+l==0)break;
                m--;l--;
                solve();
            }
        }
 
        double segSegDist(Line2D l1,Line2D l2){
            return l1.intersectsLine(l2)? 0:Math.min(Math.min(l1.ptSegDist(l2.getP1()),l1.ptSegDist(l2.getP2())),Math.min(l2.ptSegDist(l1.getP1()), l2.ptSegDist(l1.getP2())));
        }
 
        class Robot{
            double x,y,angle;
            public Robot(int x,int y, int angle) {
                this.x = x;
                this.y = y;
                this.angle = angle;
            }
            void fd(int go){
                x += Math.sin(Math.PI*angle/180.0)*go;
                y += Math.cos(Math.PI*angle/180.0)*go;
            }
            Point2D toPoint(){
                return new Point2D.Double(x,y);
            }
        }
        class State implements Comparable<State>{
            double cost;
            int v;
            public State(int v,double cost) {
                this.v = v;
                this.cost = cost;
            }
            public int compareTo(State o) {
                if(this.cost > o.cost)return 1;
                else if(this.cost < o.cost)return -1;
                return 0;
            }
        }
    }
}
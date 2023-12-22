import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.*;
 
import javax.naming.BinaryRefAddr;
 
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
 
    public Main() {
        while(in.hasNext())new AOJ1023().doIt();
    }
 
    class AOJ1023{
        final double EPS=1.0e-8;
        void doIt(){
            int gn = in.nextInt();
            int en = in.nextInt();
            int r = in.nextInt();
            if(gn+en+r==0)return;
            Point2D[] graze = new Point2D[gn];
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<100000;i++)list.add(new ArrayList<Integer>(1));
            for(int i=0;i<gn;i++)graze[i] = new Point2D.Double(in.nextDouble(), in.nextDouble());
            for(int i=0;i<en;i++)list.get(in.nextInt()).add(in.nextInt());
            int cnt = 0;
//            for(int i=0;i<gn;i++){   //graze[i]について考える。
//                int min = Math.max(0,(int)graze[i].getX()-(4*r));
//                int max = Math.min(100000-1,(int)graze[i].getX()+(4*r));
//                int y = (int)graze[i].getY();
//                for(int s=min;s<=max;s++)if(list.get(s).size()>0){
//                    for(int k=0;k<list.get(s).size();k++)if(new Point2D.Double(s,list.get(s).get(k)).distanceSq(graze[i])<4*r*4*r)cnt++;
//                }
//            }
            System.out.println(cnt);
        }
    }
}
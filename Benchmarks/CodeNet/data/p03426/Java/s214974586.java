import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class MagicCircle{
        int H,W,D;
        int[][] magicCost;
        MagicCircle(int h,int w,int d){
                this.H = h; this.W = w; this.D = d;
                this.magicCost = new int[h][w];
        }

        public void setCost(int i,int j,int cost){
                this.magicCost[i][j] = cost;
        }

}

class Wizerd{

        int MP;
        int Q;
        int[] x_y = new int[2];
        int costOfPoint = 0;
        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> R = new ArrayList<Integer>();
        Wizerd(int q){
                this.Q = q;
                this.MP = 0;
        }

        public int[] searchPoint(MagicCircle mc,int count){
                int[] xy = new int[2];
                xy[0] = mc.H;
                xy[1] = mc.W;
                 for(int i=0;i<mc.H;i++){
                        for(int j=0;j<mc.W;j++){
                                if(mc.magicCost[i][j] == this.L.get(count)){
                                        xy[0] = i;
                                        xy[1] = j;
                                        break;
                                }
                        }
                        if(xy[0]<mc.H)break;
                }
                return xy;
        }

        public void resetMP(){
                this.MP = 0;
        }

        public void move(MagicCircle mc,int count){
                int i,j;
                for(i=0;i<mc.H;i++){
                        for(j=0;j<mc.W;j++){
                                if(mc.magicCost[this.x_y[0]][this.x_y[1]] + mc.D == mc.magicCost[i][j]){
                                        this.MP += Math.abs(i - this.x_y[0]) + Math.abs(j - this.x_y[1]);
                                        this.x_y[0] = i;   this.x_y[1] = j;
                                        break;
                                }
                        }
                        if(Math.abs(i - this.x_y[0]) + Math.abs(j - this.x_y[1]) == 0)break;
                }
        }

        public void checkXY(){
                System.out.println(" startPoint : "+"("+this.x_y[0]+","+this.x_y[1]+")");
        }

}

class Main{
        public static void main(String args[]){
                //読み込み
                Scanner scan = new Scanner(System.in);
                MagicCircle mc = new MagicCircle(scan.nextInt(),scan.nextInt(),scan.nextInt());
                for(int i=0;i<mc.H;i++){
                        for(int j=0;j<mc.W;j++){
                                mc.setCost(i,j,scan.nextInt());
                        }
                }

                Wizerd wiz = new Wizerd(scan.nextInt());
                for(int i=0; i<wiz.Q; i++){
                        wiz.L.add(scan.nextInt());
                        wiz.R.add(scan.nextInt());
                }
                //チェック
                //check(mc,wiz);

                for(int i=0;i<wiz.Q;i++){
                        wiz.resetMP();
                        wiz.x_y = wiz.searchPoint(mc,i);
                        //ここまで！
                        //wiz.checkXY();
                        while(!(mc.magicCost[wiz.x_y[0]][wiz.x_y[1]] == wiz.R.get(i)))wiz.move(mc,i);
                        //System.out.println(i+"回目 MP: "+wiz.MP);
                        System.out.println(wiz.MP);
                }
        }

        public static void check(MagicCircle mc,Wizerd wiz){
                System.out.println("--- MagicCircle ---");
                System.out.println("H ="+mc.H);
                System.out.println("W ="+mc.W);
                System.out.println("D ="+mc.D);
                System.out.println("--- MagicCost ---");
                for(int i=0;i<mc.H;i++){
                        for(int j=0;j<mc.W;j++){
                                System.out.print(mc.magicCost[i][j]+" ");
                        }
                        System.out.println(" ");
                }
                System.out.println("--- Wizerd ---");
                for(int i=0;i<wiz.Q;i++){
                        System.out.println(wiz.L.get(i)+" to "+wiz.R.get(i));
                }
        }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int H = sc.nextInt();
int W = sc.nextInt();
int D = sc.nextInt();
int pos[][] = new int[H*W][2];
for(int i=0;i<H;i++){
   for(int j=0;j<W;j++){
       int k = sc.nextInt();
       pos[k-1][0] = i;
       pos[k-1][1] = j;
   }
}
int Q = sc.nextInt();
int L[] = new int[Q];
int R[] = new int[Q];
for(int q=0;q<Q;q++){
   L[q] = sc.nextInt();
   R[q] = sc.nextInt();
}

//出力変数
int ans[] = new int[Q];

//計算のための変数
int start=0,goal=0;
int disx=0,disy=0;
int pointerx=0;
int pointery=1;

//計算
for(int q=0;q<Q;q++){
   ans[q] = 0;

//ｘ座標
   start = L[q];
   goal = start + D;
   pointerx = pos[goal-1][0]-pos[start-1][0];
if(goal ==R[q]){
disx += Math.abs(pos[start-1][0]-pos[goal-1][0]);
}
   for(;start != R[q] && goal != R[q];){
     for(;(pos[start-1][0]-pos[goal-1][0])*pointerx>0 && goal != R[q];)  {
        goal = goal + D;
}
  disx += Math.abs(pos[start-1][0]-pos[goal-1][0]);
  start = goal;
  goal = goal + D;
  pointerx = pos[goal-1][0]-pos[start-1][0];
}
//ｙ座標
   start = L[q];
   goal = start + D;
   pointery = pos[goal-1][1]-pos[start-1][1];
if(goal ==R[q]){
disy += Math.abs(pos[start-1][1]-pos[goal-1][1]);
}
   for(;start != R[q] && goal != R[q];){
     for(;(pos[start-1][1]-pos[goal-1][1])*pointery>0 && goal != R[q];)  {
        goal = goal + D;
}
  disy += Math.abs(pos[start-1][1]-pos[goal-1][1]);
  start = goal;
  goal = goal + D;
  pointery = pos[goal-1][1]-pos[start-1][1];
}
ans[q]=disx+disy;
}

//出力
for(int q=0;q<Q;q++){
   System.out.println(ans[q]);
}

}
}
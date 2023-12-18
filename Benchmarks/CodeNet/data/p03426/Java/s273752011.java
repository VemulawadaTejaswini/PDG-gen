import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int H = sc.nextInt();
int W = sc.nextInt();
int D = sc.nextInt();
int num[][] = new int[H][];
for(int i=0;i<H;i++){
num[i] = new int[W];
for(int j=0;j<W;j++){
num[i][j] = sc.nextInt();
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
int start=0,x=0,y=0,goal=0,X=0,Y=0;

//計算
for(int q=0;q<Q;q++){
   //ｑの関わる変数の初期化
ans[q] = 0;
start = L[q];
goal = start + D;

for(; start != R[q];){
   //座標を調べる
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
if(num[i][j] == start){
x = i;
y = j;
}}}
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
if(num[i][j] == goal){
X = i;
Y = j;
}}}
ans[q] += Math.abs(X-x)+Math.abs(Y-y);
start = start + D;
goal = goal + D;
}
}

//出力
for(int q=0;q<Q;q++){
System.out.println(ans[q]);
}

}
}
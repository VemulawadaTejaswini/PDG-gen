import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public sttic void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputSteamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st1=new StringTokenizer(line);
int w=Integer.parseInt(st1.nextToken());
int h=Integer.parseInt(st1.nextToken());
int n=Integer.parseInt(st1.nextToken());
int[] x=new int[n];
int[] y=new int[n];
for(int i=0;i<n;i++){
line=br.readLine();
StringTokenizer st2=new StringTokenizer(line);
x[i]=Integer.parseInt(st2.nextToken());
y[i]=Integer.parseInt(st2.nextToken());
}
int cnt=0;
for(int i=0;i<n-1;i++){
cnt+=minRoad(x[i],y[i],x[i+1],y[i+1]);
}
out.println(cnt);
}
}
private static int minRoad(int a,int b,int c,int d){
if(a==c) return Math.abs(b-d);
if(b==d) return Math.abs(a-c);
int x=a-c;
int y=b-d;
if(x*y>0){
x=Math.abs(x);
y=Math.abs(y);
return Math.max(x,y);
}
x=Math.abs(x);
y=Math.abs(y);
return x+y;
}
}
import java.io.*;
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x,y;
while(readStrToInt(br, x, y)){
swapNum(x, y);
System.out.println(x+" "+y);
}
br.close();
}
static boolean readStrToInt(BufferedReader br, int x, int y)throws IOException{
String str=br.readLine();
String[] arr=str.split(" ");
x=Integer.parseInt(arr[0]);
y=Integer.parseInt(arr[1]);
if(x==0 &&y==0) return false;
return true;
}
static void swapNum(int x, int y){
int tmp;
if(x<=y) return;
tmp=x;
x=y;
y=tmp;
return;
}
}
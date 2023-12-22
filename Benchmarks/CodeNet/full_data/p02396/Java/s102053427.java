import java.io.*;
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x, y;
while(readStrToInt(br)){
swapNum();
System.out.println(x+" "+y);
}
br.close();
}
static boolean readStrToInt(Bufferedreader br){
String str=br.readLine();
String[] arr=str.split(" ");
x=Integer.parseInt(arr[0]);
y=Integer.parseInt(arr[1]);
if(x==0 &&y==0) return false;
return true;
}
static void swapNum(){
int tmp;
if(x<=y) return;
tmp=x;
x=y;
y=tmp;
return;
}
}
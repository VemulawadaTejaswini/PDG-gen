import java.io.*;
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
String[] arr=str.split(" ");
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=Integer.parseInt(arr[2]);
diviNum(a, b, c);
br.close();
}
static void diviNum(int a, int b, int c){
int x=0;
int i=b-a+1;
for(int j=0;j<i;j++){
if(c%a==0)  x++;
a++;
}
System.out.println(x);
}
}
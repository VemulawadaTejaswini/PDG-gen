import java.io.*;

class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
for(int i=0; i<n; i++){
String str = br.readLine();
String[] s = str.split(" ");
double xa = Double.parseDouble(s[0]);
double ya = Double.parseDouble(s[1]);
double ra = Double.parseDouble(s[2]);
double xb = Double.parseDouble(s[3]);
double yb = Double.parseDouble(s[4]);
double rb = Double.parseDouble(s[5]);
double d=Math.hypot(xa-xb,ya-yb);
if(ra+rb<d){
System.out.println("0");
}
else if(ra+rb>=d&&Math.abs(ra-rb)<=d){
System.out.println("1");
}
else if(ra>rb){
System.out.println("2");
}
else{
System.out.println("-2");
}
}
}
}
import java.io.*;
 
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
String[] values=line.split(" ");
double xa=Double.parseDouble(values[0]);
double ya=Double.parseDouble(values[1]);
double xb=Double.parseDouble(values[2]);
double yb=Double.parseDouble(values[3]);
double xc=Double.parseDouble(values[4]);
double yc=Double.parseDouble(values[5]);
double xd=Double.parseDouble(values[6]);
double yd=Double.parseDouble(values[7]);
if(xa==xb&&yc==yd){
System.out.println("YES");
}
if(xc==xd&&ya==yb){
System.out.println("YES");
}
double my=(ya-yb)*(yc-yd);
double mx=(xa-xb)*(xc-xd);
System.out.println(mx==my*-1?"YES":"NO");
}
}
}
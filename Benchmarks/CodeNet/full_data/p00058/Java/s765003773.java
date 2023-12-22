import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
String[] values=line.split(" ");
double ax=Double.parseDouble(values[0]);
double ay=Double.parseDouble(values[1]);
double bx=Double.parseDouble(values[2]);
double by=Double.parseDouble(values[3]);
double cx=Double.parseDouble(values[4]);
double cy=Double.parseDouble(values[5]);
double dx=Double.parseDouble(values[6]);
double dy=Double.parseDouble(values[7]);
double det1=(ay-by)*(cx-dx);
double det2=(ax-bx)*(cy-dy);
if(ax==bx&&cy==dy){
System.out.println("YES");
}
else if(ay==by&&cx==dx){
System.out.println("YES");
}
else if(det1*-1==det2&&det1!=0.0){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}
}
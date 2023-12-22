import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
d weioubleght;
while((line=br.readLine())!=null){
weight=Double.parseDouble(line);
classOfBoxing(weight);
}
}
private static void classOfBoxing(double w){
PrintWriter p=new PrintWriter(System.out);
if(w<=48.0){
p.println("light fly");
}
else if(w<=51.0){
p.println("fly");
}
else if(w<=54.0){
p.println("bantam");
}
else if(w<=57.0){
p.println("feather");
}
else if(w<=60.0){
p.println("light");
}
else if(w<=64.0){
p.println("light welter");
}
else if(w<=69.0){
p.println("welter");
}
else if(w<=75.0){
p.println("light middle");
}
else if(w<=81.0){
p.println("middle");
}
else if(w<=91.0){
p.println("light heavy");
}
else{
p.println("heavy");
}
}
}
import java.io*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count;
while(!(line=br.readLine()).equals("0")){
int n=Integer.parseInt(line);
count=0;
for(int i=1;i<=6;i++){
int d=Math.pow(5,i);
if(n<d){
break;
}
count+=(int)(n/d);
}
System.out.println(count);
}
}
}
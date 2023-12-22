import java.io.*; 
class Main {
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int i=0;
int x;
while((x=Integer.parseInt(br.read())) != 0){
i++;
System.out.println("Case " +i+ ": " + x);
}
br.close();
}
}
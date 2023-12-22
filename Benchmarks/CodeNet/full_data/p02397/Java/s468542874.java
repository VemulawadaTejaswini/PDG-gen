import java.io.*; 
class Main {
public static void main(String[] args) throws IOException{
InputStreamReader br = new InputStreamReader(System.in);
int i=0;
int x;
while(x=br.read() != 0){
i++;
System.out.println("Case " +i+ ": " + x);
}
br.close();
}
}
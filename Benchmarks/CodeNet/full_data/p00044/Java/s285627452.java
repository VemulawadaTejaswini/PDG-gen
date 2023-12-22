import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int a=Integer.parseInt(line);
BigInteger x=new BigInteger(a);
System.out.print(x.nextProbablePrime()+" "+prevProbablePrime(a));
}
}
private static int prevProbablePrime(int a){
a--;
while(true){
BigInteger y=new BigInteger(a);
if(y.isProbablePrime(16)){
return a;
}
a--;
}
}
}
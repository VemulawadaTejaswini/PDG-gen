
import java.io.*;
class Main{

public static void main(String [] args)throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
int b;

int large;
int perimeter;

a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());

large = a*b;
perimeter=(a+b)*2;
System.out.println(large);
System.out.println(" ");
System.out.println(perimeter);


}

}
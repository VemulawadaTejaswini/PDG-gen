import java.util.Scanner;
import java.io.*;

class Main{
public static void main(String[] args)throws java.io.IOException{
 
Scanner scan = new Scanner(System.in);
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

String tmp = input.readLine();
int i = Integer.parseInt(tmp);

int max = -1000000, min = 1000000, sum = 0;
for(int j = 0; j <i; j++){
    int x = scan.nextInt();
    sum += x;
    if(x > max) max = x;
    if(x < min) min = x;
    }
 
 
System.out.println(min +" "+ max +" "+sum);
   }
}
    
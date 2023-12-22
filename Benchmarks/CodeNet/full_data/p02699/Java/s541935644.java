import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=scan.nextInt();

if(n<=m){
System.out.println("unsafe");
}else{
System.out.println("safe");
}

}
}
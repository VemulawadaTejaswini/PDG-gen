import java.util.Scanner;
public class Main {
public static void main(String[] args) {
//int x=Integer.parseInt(args[0]);
Scanner sc = new Scanner(System.in);
 int x = sc.nextInt();
 int answer =1;
 for(int i=0;i<3;i++){
	 answer=answer*x;
 }
System.out.println(answer);
}}
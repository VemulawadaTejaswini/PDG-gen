import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int i = scan.nextInt();
int h = i/3600;
int m = i%3600/60;
int s = i%60;
System.out.println(h + ":" + m + ":" + s);
}}

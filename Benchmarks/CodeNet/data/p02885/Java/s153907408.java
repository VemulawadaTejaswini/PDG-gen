import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if(2*b>=a){
System.out.println(0);
}else{
System.out.println(2*b-a);
}
}
}
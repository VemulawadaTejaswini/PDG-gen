import java.util.Scanner

class Main{
public static void main(String... args){
Scanner sc = new Scanner(System.in);
int money = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println((money - a) % b);
}
}
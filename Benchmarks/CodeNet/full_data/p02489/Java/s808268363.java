import java.util.Scanner;
public class Main{
public static void Main(String[] args){

Scanner sc = new Scanner(System.in);

for (int i = 1; ; i++){
int x = sc.nextInt();
           if(x==0)break;
System.out.println("Case "+i+":"+x);
}
}
}
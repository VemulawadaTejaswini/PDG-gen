import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
System.out.printf(" ");
for(int i=1;i<=a;i++){
if(i%3==0 && i%10==3){
System.out.printf("%d ",i);
}else if(i%3==0){
System.out.printf("%d ",i);
}else if(i%10==3){
System.out.printf("%d ",i);
}
}
System.out.println();
}
}
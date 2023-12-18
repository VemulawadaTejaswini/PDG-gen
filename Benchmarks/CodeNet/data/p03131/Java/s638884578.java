import java.util.*;
class Main{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

int K=sc.nextInt(); 
int A=sc.nextInt();
int B=sc.nextInt();

System.out.println(((K-2)+1)%A+((K-2)+1)/A*B);
}
}
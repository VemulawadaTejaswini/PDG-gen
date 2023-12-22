import java.util.Scanner;

public class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int limit = sc.nextInt();
int x;
for(int i = 1; i<= limit ; i++){
  x = i;
  if(x%3 ==0){
    System.out.print(" "+x);
    continue;
  }
  while(x>0){
if(x%10 ==3){
  System.out.print(" "+ i);
  break;
}
    x /=10;
  }

}//for
System.out.println("");
}//main


}//class


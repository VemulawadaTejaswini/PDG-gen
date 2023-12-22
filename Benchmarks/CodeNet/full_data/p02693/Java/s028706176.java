import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 int K = scan.nextInt();
 int A = scan.nextInt();
 int B = scan.nextInt();
 int count = 0;
  
  for (int i = 0; i < B-A+1; i++){
  	if ((A + i) % K == 0){
      count += 1;
    }
    else{
    }
  }
  if (count > 0){
  System.out.println("OK");
  }
  if (count == 0){
    System.out.println("NG");
  }
 }
}
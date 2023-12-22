import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int maxNum = 0;
int minNum = 10000000000;
for(int i = 0; i < n; i++){
  int num = sc.nextInt();
  if(num > maxNum){
   maxNum = num;
   }
  if(num < minNum){
   minNum = num;
   }
  }
 System.out.println(maxNum-minNum);
 }
}

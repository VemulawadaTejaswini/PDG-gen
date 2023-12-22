import java.util.Scanner;

public class Main{

 public static void main(String[] args){

  int a=0;

  Scanner num = new Scanner(System.in);
  while(true){

   int student = num.nextInt();
   if(student==0) break;
   int[] scores = new int[student];
   for(int i=0;i<scores.length;i++){
    scores[i]=num.nextInt();
   }
   double average=0,variance=0,temp=0;
   int sum=0;
   for(int j=0;j<scores.length;j++){
    sum = sum + scores[j];
   }
   average=(double)sum/(double)student;
   for(int k=0;k<scores.length;k++){
    temp = temp + (scores[k]-average)*(scores[k]-average);
   }
   variance = temp/(double)student;
   
   System.out.println(Math.sqrt(variance));
  }
 }
}
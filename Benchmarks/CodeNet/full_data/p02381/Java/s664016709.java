import java.util.Scanner;

public class Main{
  public static void main(String[]args){
   
   try(Scanner sc = new Scanner(System.in)){
      while(true){
       int n = sc.nextInt();
      if(n == 0){
	break;
      }
	int[]score = new int[n];
	for(int i = 0;i < n;i++){
	score[i] = sc.nextInt();
	}
	double average = 0,variance = 0;
	for(int i = 0;i < n;i++){
	average = average+score[i];
	}
	average = average/n;
	for(int i = 0;i < n;i++){
	variance = (score[i]-average)*(score[i]-average)+variance;
	}
	variance = variance/n;
	System.out.println(Math.sqrt(variance));
     }   
   }
  }
}

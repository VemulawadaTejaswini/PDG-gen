import java.util.Scanner;

 public class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 while(true){
 int n=sc.nextInt();
 if(n==0)  break;
 int[] scores=new int[n];
 int sum=0;
 for(int i=0;i<n;i++){
 scores[i]=sc.nextInt();
 sum+=scores[i];
 }
 double ave=0.0,var=0.0;
 ave=(double)sum/n;
 for(int i=0;i<n;i++){
 var+=Math.pow(scores[i]-ave,2)/n;
 }
 System.out.printf("%.8f\n",Math.sqrt(var));
 }
 }
 }
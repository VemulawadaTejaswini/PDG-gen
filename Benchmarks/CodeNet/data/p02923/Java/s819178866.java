import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Hi = new int[N];
   int count =0;
   int countmem =0;
   for(int i=0;i<N;i++) Hi[i]= sc.nextInt();
   for(int i =0;i<N-1;i++){
    if(Hi[i] >= Hi[i+1]) count++;
    else{
     if(countmem < count) countmem = count;
     count =0;
    }
   }
   
   
System.out.println(countmem);   
   
 }
}
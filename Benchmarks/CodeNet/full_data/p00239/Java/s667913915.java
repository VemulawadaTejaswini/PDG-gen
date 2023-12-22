import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
   for(;;){
	  int n=sc.nextInt();
   if(n==0)break;
   int[][] data= new int[n+1][5];
   for(int i=0; i<n; i++){
	   data[i][0]=sc.nextInt();
	   data[i][1]=sc.nextInt();
	   data[i][2]=sc.nextInt();
	   data[i][3]=sc.nextInt();
	   data[i][4]=(data[i][1]+data[i][3])*4+data[i][2]*9;
   }
   for(int i=1; i<5; i++) data[n][i]=sc.nextInt();
   int flag=0;
   for(int i=0; i<n; i++){
 if(data[n][1]>=data[i][1]&&data[n][2]>=data[i][2]&&data[n][3]>=data[i][3]){
   System.out.println(data[i][0]); flag++;
 }
   }
   if(flag==0)System.out.println("NA");
   }
}
 }
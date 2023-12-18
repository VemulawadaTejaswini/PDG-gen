import java.util.Scanner;
public class Main{
    

     public static void main(String []args){
         String x = new Scanner(System.in).nextLine();
		
		String array1[]=x.split("\\s+");
		long N =Long.parseLong(array1[0]);
		long A=Long.parseLong(array1[1]);
		long B=Long.parseLong(array1[2]);
		CoubtBalls(N,A,B);
		

     }
     public static void CoubtBalls(long N,long A,long B)
     {
         long result=0;
         long temp=0;
         if(N%(A+B) > A) 
         {
             temp=A;
         }
         else 
         {
            temp= N%(A+B);
         }
         result=((N/(A+B))*A)+temp;
         System.out.print(result);
     }
     
}
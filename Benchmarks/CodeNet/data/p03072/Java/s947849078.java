import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Hi = new int[N];
   for(int i = 0; i<N;i++)
   {
		Hi[i] = sc.nextInt();       
   }
   int count =0;
   boolean flg = false;
   for(int i = 0; i<N;i++)
   {
     flg = true;
		for(int k = 0;k <i; k++)
        {
         	if(Hi[k]>Hi[i])
            {
              	flg = false;
          		break;
            }
        }
     if(flg) count++;
   }
   System.out.println(count);
 }
}
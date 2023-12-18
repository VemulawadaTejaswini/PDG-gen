import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int Q = sc.nextInt();
   String S = sc.next();
   int li = 0;
   int ri = 0;
   int count = 0;
   String Si = "";
   for(int i = 1;i<=Q;i++)
   {
    	li = sc.nextInt();
     	ri = sc.nextInt();
     	count =0;
     	Si = S.substring(li-1,ri);
        for(int k = 0; k<Si.length()-1;k++)
        {
          	if(Si.substring(k,k+2).equals("AC")) count++;
        }
     	System.out.println(count);
   }
 }
}
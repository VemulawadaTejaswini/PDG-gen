import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws Exception {
    int N =0 ,i=0,max=0,count=0;
  //  Scanner in = new Scanner (System.in);
    BufferedReader in=new BufferedReader( new InputStreamReader(System.in));
    N=Integer.parseInt(in.readLine());
   StringTokenizer x= new StringTokenizer(in.readLine());
    in.close();
    int []nthn=new int[N];
    while(N!=0){
     nthn[i]=Integer.parseInt(x.nextToken()); i++;  
    N--;}
        for (int j = 0; j < nthn.length*2; j++) {
         //   if (j<nthn.length) System.out.print(nthn[j]+" " );
               for (int k = 0; k < nthn.length; k++) {
                   if (j<nthn.length)
                count = (nthn[j]==(nthn[k]+1)||nthn[j]==(nthn[k])-1)?++count:count;
                else
                count = ((nthn[j-nthn.length]-1)==(nthn[k]+1)||(nthn[j-nthn.length]-1)==nthn[k])?++count:count;      
            }
            max=(max>count)?max:count;
            count=0;
        }
        System.out.println(max+1);
    }
}
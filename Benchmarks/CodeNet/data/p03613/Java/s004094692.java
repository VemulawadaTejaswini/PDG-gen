import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args)throws Exception {
    int N =0,x=0 ,i=0,max=0,count=0;
  //  Scanner in = new Scanner (System.in);
    BufferedReader in=new BufferedReader( new InputStreamReader(System.in));
    N=in.read();
    //byte []add=new byte[N];
    //byte []sub=new byte[N];
    int []nthn=new int[N];
    while(N!=0){
     nthn[i]=in.read();
    // add[i]=(byte)(nthn[i]+1);
    // sub[i]=(byte)(nthn[i]-1);
     i++;  
    N--;}
    in.close();
    
    //count for x
        for (int j = 0; j < nthn.length*2; j++) {
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
import java.io.*;

public class Main{
  public static void main(String[] args){
        BufferredReader br=new BufferedReader(new INputStreamReader(System.in));
        int l,r,d,n;
        int count=0;
        
        String str1=br.readLine();
        l=Integer.parseInt(str1);
        String str2=br.readLine();
        r=Integer.parseInt(str2);
        String str3=br.readLine();
        d=Integer.parseInt(str3);
        n=l;
    
      for(int i=l;i<r;i++){
        if(l<n<r&&n%d==0)System.out.println(count);
         count++;
          }
  
  }
}
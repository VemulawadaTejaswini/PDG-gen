import java.util.*;

 // Compiler version JDK 11.0.2

 public class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    String [] s = new String[a];
    for(int i=0;i<a;i++)
    s[i]= sc.next();
    for(int i =0;i<a;i++)
    {
      for(int j=i+1;j<a;j++)
      {
        if(s[j]=="Z")
        continue;
        if(s[i].equals(s[j]))
        {
          s[j]="Z";
        }
      }}
      int t =0;
      for(int i=0;i<a;i++)
      {
        if(s[i].equals("Z"))
        t++;
      }
      System.out.println(a-t);
    }
    }
    
    

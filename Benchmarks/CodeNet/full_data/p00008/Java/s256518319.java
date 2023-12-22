import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner x=new Scanner(System.in);
     String vt;
     int n=0,f=0;
     
     while(x.hasNextLine()){
      f=0;
      int nm=x.nextInt();
      
         for(int a=0;a<=9;a++)
         for(int b=0;b<=9;b++)
         for(int c=0;c<=9;c++)
         for(int d=0;d<=9;d++)
         {
            n=a+b+c+d;
            if (nm==n)
            f++;
         }
       System.out.println(f);
     }
        
  }
}
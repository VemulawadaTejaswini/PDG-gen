import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    input();
   }
   static void input()
   {
     Scanner sc = new Scanner(System.in);
     
     while (true)
     {
       int m = sc.nextInt();//Mid-term test
       
       int f = sc.nextInt();//Final exam
       
       int r = sc.nextInt();//Retest
       
       if (m == -1 && f == -1 && r == -1)break;
       
       output(m,f,r);
     }
   }
   static void output(int m,int f,int r)
   {
     if (m == -1 || f == -1)
     {
       ln("F");
       
       return ;
     }
     if (m + f >= 80)
     {
       ln("A");
       
       return ;
     }
     if (m + f >= 65)
     {
       ln("B");
       
       return ;
     }
     if (m + f >= 50)
     {
       ln("C");
       
       return ;
     }
     if (m + f >= 30)
     {
       if (r >= 50)
       {
         ln("C");
         
         return ;
       }
        else
       {
         ln("D");
         
         return ;
       }
     }
     if (m + f < 30)
     {
       ln("F");
       
       return ;
     }
   }
   static void ln(String s)
   {
     System.out.println(s);
   }
 }
    

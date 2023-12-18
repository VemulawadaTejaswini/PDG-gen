import java.util.*;
class Main
{
   public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int note1=n/500;
        n= n-(500*note1);
        int note2= n/5;
       int answer= (note1*1000)+(note2*5);
       System.out.println(answer);
    }  
}



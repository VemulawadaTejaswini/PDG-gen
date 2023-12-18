import java.util.*;

public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a[] = new long[3];
    for(int i=0;i<3;i++)
    {
          a[i] = sc.nextInt();
          if(a[i]%2==0)
          {
             System.out.print("0");
              System.exit(0);
          };
   };
  Arrays.sort(a);
   System.out.print(a[0]*a[1]);
}


 
}
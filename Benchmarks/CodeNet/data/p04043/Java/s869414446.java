import java.util.Scanner;
 
class Main{
  public static void main(String args [])
  {
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
   	int array[] = new int[3];
    array[0]=a;
    array[1]=b;
    array[2]=c;
    int five =0,seven=0;
    for(int i =0; i<3;i++)
    {
      if(array[i]==5)five++;
      else if(array[i]==7) seven++;
    }
    if(five==2 && seven=1) System.out.println("YES");
    else System.out.println("NO");
  }
}
import java.util.Scanner;

class Main{
  public static void main(String args [])
  {
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
   	int array[] = new int[3];
    array[0]=a;
    array[1]=b;
    array[2]=c;
    int five =0,seven=0;
    for(int i =0; i<3;i++)
    {
      if(array[i]==5)five++;
      else if(array[i]==7) seven++;
    }
    if(five==2 && seven==1) System.out.println("YES");
    else System.out.println("NO");
  }
}

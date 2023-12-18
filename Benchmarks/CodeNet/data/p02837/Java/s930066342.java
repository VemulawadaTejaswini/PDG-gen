import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    ArrayList<Integer> honest = new ArrayList<>();
    Arraylist<Integer> dishonest = new Arraylist<>();
    while(t-->0)
    {
      int n = input.nextInt();
      while(n-->0)
      {
        int x = input.nextInt();
        int y = input.nextInt();
        
        if(y==0)
          dishonest.add(x);
       	else
          honest.add(x);
      }
    }
    if(honest.size()==dishonest.size())
      System.out.println(0);
    else if(honest.size()==0)
      System.out.println(1);
    else
      System.out.println(honest.size());
    
    
    
    
  }
}
import java.util.HashSet;
import java.util.Scanner;

class Main{
  public static void  main(String[]args){
    Scanner  sc=new Scanner(System.in);
    
    HashSet<Integer> hs=new HashSet<Integer>();
    
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
      hs.add(sc.nextInt());
    
    System.out.println(hs.size());
  }
}


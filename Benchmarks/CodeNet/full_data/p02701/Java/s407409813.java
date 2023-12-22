import java.util.hashSet;
import java.util.Scanner;

class Main{
  public static void  main(String[]args){
    Scanner  sc=new Scanner(System.in);
    
    HashSet hs=new HashSet();
    
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
      hs.add(sc.nextInt());
    
    System.out.println(hs.size());
  }
}


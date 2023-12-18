import java.util.HashSet;
import java.util.Scanner;

class Main{
  public static void  main(String[]args){
    try{
    Scanner  sc=new Scanner(System.in);
    
    HashSet<String> hs=new HashSet<String>();
    
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
      hs.add(sc.next());
    
    System.out.println(hs.size());
      
  }
}


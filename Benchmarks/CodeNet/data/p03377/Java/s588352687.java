import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    if(z<y)
    {
    System.out.println("Yes");
    System.out.println("If there are one cat and four dogs among the B="+y+" animals, there are X="+z+" cats in total.");
    }
    else{
    System.out.println("No");
    System.out.println("Even if all of the B="+y+" animals are cats, there are less than X="+z+" cats in total.");
    }
  }
}
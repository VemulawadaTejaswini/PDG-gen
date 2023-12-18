import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(a>2?"Christmas":a>23?"Christmas Eve":a>22?"Christmas Eve Eve":"Christmas Eve Eve Eve");
  }
}

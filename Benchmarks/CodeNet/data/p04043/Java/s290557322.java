import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] unko=new int[3];
    int sum=1;
    for(int i=0; i<3; i++){
      unko[i]=sc.nextInt();
      sum*=unko[i];
    }
    if(sum==175){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
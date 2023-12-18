import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int h=sc.nextInt(),w=sc.nextInt();
    char[][] c=new char[h][w];
    for(int i=0;i<h+2;i++){
      if(i==0||i==h+1){
        for(int j=0;j<w+2;j++){
          System.out.print("#");
        }
      }else{
        c[i]=sc.next().toCharArray();
        for(int j=0;j<w+2;j++){
          if(j==0||j==w+1){
            System.out.print("#");
          }else{
            System.out.print(c[i-1][j-1]);
          }
        }
      }
      System.out.print("\n");
    }
  }
}

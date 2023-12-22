import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();
    while(H != 0 || W != 0){
	StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<W; i++){
          sb2.append("#");}
      System.out.println(sb2);
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<W-2; i++ ){
        sb.append(".");
      }
      for(int j=0; j<H-2; j++){
        System.out.println("#" + sb + "#");
      }
      System.out.println(sb2);
      System.out.println("");
      H = scan.nextInt();
      W = scan.nextInt();
    }
 
  }
}
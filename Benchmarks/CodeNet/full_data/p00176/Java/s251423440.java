import java.util.Scanner;
import static java.lang.System.out;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String name[] = {"black","blue","lime","aqua","red","fuchsia","yellow","white"};
    int color[][] = {{0,0,0},{0,0,255},{0,255,0},{0,255,255},{255,0,0},{255,0,255},{255,255,0},{255,255,255}};
    while(true){
      String str = scan.next();
      if(str.equals("0")) break;

      int R = Integer.parseInt(str.substring(1,3),16);
      int G = Integer.parseInt(str.substring(3,5),16);
      int B = Integer.parseInt(str.substring(5,7),16);
      double min = Double.MAX_VALUE;
      int Index = 0;
      for(int i = 0 ; i < 8 ; i++){
        double near = Math.sqrt(Math.pow(R - color[i][0],2) + Math.pow(G - color[i][1],2) + Math.pow(B - color[i][2],2));
        if( near < min ){
          min = near;
          Index = i;
        }
      }
      out.println(name[Index]);
    }
  }
}
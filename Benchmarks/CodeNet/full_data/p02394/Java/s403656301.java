import java.util.*;

class Main{
 public static void main(String[] args){
 
  Scanner scan = new Scanner(System.in).useDelimiter("\\s\\n*");

  int W=scan.nextInt(),H=scan.nextInt(),x=scan.nextInt(),y=scan.nextInt(),r=scan.nextInt();

  i f(x+r<=W && x-r>=0 && y+r<=H && y-r>=0){System.out.println("Yes");}
  else{System.out.println("No");}
 }
}
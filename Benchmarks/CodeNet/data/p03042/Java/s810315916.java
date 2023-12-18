import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    String str = String.valueOf(s);
    boolean yymm = false;
    boolean mmyy = false;
    
    if(Integer.parseInt(str.substring(0,2))<13){
      if(Integer.parseInt(str.substring(0,2))!=0){
        mmyy = true;
      }
    }
    if(Integer.parseInt(str.substring(2))<13){
      if(Integer.parseInt(str.substring(2))!=0){
        yymm = true;
      }
    }
    if(mmyy&&yymm){System.out.println("AMBIGUOUS");}
    if(mmyy&&!yymm){System.out.println("MMYY");}
    if(!mmyy&&yymm){System.out.println("YYMM");}
    if(!mmyy&&!yymm){System.out.println("NA");}
  }
}

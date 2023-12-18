import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    char[] tile=s.toCharArray();
    int start0=0,start1=0;
    for(int i=0;i<tile.length-1;i=i+2){
      //偶数番目が0の時
      if(tile[i]!='0'){
        start0++;
      }
      if(tile[i+1]!='1'){
        start0++;
      }
      //奇数番目が0の時
      if(tile[i]!='1'){
        start1++;
      }
      if(tile[i+1]!='0'){
        start1++;
      }
    }
    if(start0>=start1){
      System.out.print(start1);
    }else{
      System.out.print(start0);
    }
  }
}
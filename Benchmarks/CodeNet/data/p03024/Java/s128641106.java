import java.util.*;

class Main{
  int numo,numx;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] strArray = str.split("");
  }
  for(int i=0; i < strArray.length ;i++){
    if("o".equals(strArray[i])){
      numo++;
    }else{
      numx++;
    }
  }
  if(numo>=numx){
    System.out.println("YES");
  }else{
    System.out.println("NO");
  }
}

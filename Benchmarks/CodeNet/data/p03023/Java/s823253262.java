import java.util.*;

class Main{
  public static void main(String[] args){
    int numo=0;
  //  int numx=0;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    //String[] strArray = str.split("");
  for(int i=0; i < str.length(); i++){
    if(String.valueOf(str.charAt(i)).equals("o")){
      numo++;
    }
  }
  if(numo>7 || numo+(15-str.length())>7){
    System.out.println("YES");
  }else{
    System.out.println("NO");
    }
  }
}

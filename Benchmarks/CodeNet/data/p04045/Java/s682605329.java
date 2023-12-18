import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();    
    String[] ilist =　new String[k]; 
    
    for(int i = 0; i<k; i++){
      ilist[i] = String.valueOf(sc.nextInt());
    }
    
    while(true){
      boolean boo = true;
      String nstr = String.valueOf(n);
      for(String str : ilist){
        if(nstr.contais(str)){
          boo = false;
          break;
        }
      }
      if(boo){
        break;
      }
      n++;
    }
    System.out.println(n);
  }
}

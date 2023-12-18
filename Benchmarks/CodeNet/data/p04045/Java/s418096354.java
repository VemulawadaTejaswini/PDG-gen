import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<String> list = new ArrayList<String>();
    
    int[] ilist = new int[k]; 
    
    for(int i = 0; i<k; i++){
      String str = String.valueOf(iList[i]);
      list.add(str);
    }
    
    while(true){
      boolean boo = true;
      String nstr = String.valueOf(n);
      for(String str : list){
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

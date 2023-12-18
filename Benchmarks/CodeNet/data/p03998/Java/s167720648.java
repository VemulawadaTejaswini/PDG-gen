import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    /*
    a = 0
    b = 1
    c = 2
    */
    
    String str[] = new String[3];
    int count[] = new int[3];
    for(int i = 0 ; i < 3 ; ++i){
      str[i] = sc.next();
      count[i] = 0;
    }

    int i = 0;
    
    while(true){
      
      
      //カードぽいっ
      count[i]++;
  
      //あがりの人いるかな
      if(count[i]==str[i].length()){
        if(i==0){
          System.out.println("A");
        }else if(i==1){
          System.out.println("B");
        }else if(i==2){
          System.out.println("C");
        }
        return;
      }
      
      //次の人誰かな
      if(str[i].charAt(count[i])=='a'){
        i=0;
      }else if(str[i].charAt(count[i])=='b'){
        i=1;
      }else if(str[i].charAt(count[i])=='c'){
        i=2;
      }
 
    }

  }
}
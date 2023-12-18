import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    //ans
    String ans = "No";

    //bingo card
    List<Integer> bc = new ArrayList<Integer>();
    for(int i = 0; i < 9; i++){
      int b = sc.nextInt();
      bc.add(Integer.valueOf(b));      
    }
    
    //called or not
    boolean[] cn = new boolean[9];
    
    //called number list
    int cnList = sc.nextInt();
    
    //true count
    int tc = 0;
    
    for(int i = 0; i < cnList; i++){
      //called number
      int cNum = sc.nextInt();
      
      //index
      int id = bc.indexOf(cNum);

      if(id != -1){
        cn[id] = true;
        tc++;
      }
    }
    
    if(tc>6){
      ans = "Yes";
    } else if(tc>2){
      if(cn[4]){
        if((cn[0]&&cn[8])||(cn[1]&&cn[7])||(cn[2]&&cn[6])||(cn[3]&&cn[5])){
          ans = "Yes";
        }
      } else if(cn[0]){
        if((cn[1]&&cn[2])||(cn[3]&&cn[6])){
          ans = "Yes";
        }
      } else if(cn[2]){
          if(cn[5]&&cn[8]){
            ans = "Yes";
          }
      } else if(cn[6]){
          if(cn[7]&&cn[8]){
            ans = "Yes";
          }
      }
    }
    
    
    System.out.println(ans);
    
  }
}
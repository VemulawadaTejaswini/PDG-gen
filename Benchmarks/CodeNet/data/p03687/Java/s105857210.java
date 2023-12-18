import java.util.*;
public class Main{
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    //System.out.println(line);
    
    char[] ca = line.toCharArray();
    ArrayList<Character> cat = new ArrayList<Character>();
    ArrayList<Integer> cac = new ArrayList<Integer>();
    
    for(int i=0; i<ca.length; i++){
        if(cat.indexOf(ca[i]) == -1){
           cat.add(ca[i]);
           cac.add(1);
        }else{
           int idx = cat.indexOf(ca[i]);
           cac.set(idx, cac.get(idx)+1);
        }
    }
    
    int[] maeakimax = new int[cat.size()];
    int[] usiro = new int[cat.size()];
    for(int i=0; i<maeakimax.length; i++){
      char c = cat.get(i);
      int count = 0;
      for(int j=0; j<ca.length; j++){
          if(ca[j] == c){
             if(maeakimax[i] < count){
                maeakimax[i] = count;
             } 
             usiro[i] = j;
             count = 0;
          }else{
             count++;
          }
      }
    }
    int[] usiroakimax = new int[cat.size()];
    for(int i=0; i<cat.size(); i++){
       usiroakimax[i] = line.length() - usiro[i] - 1;
    }
    
    int anser = 100;
    for(int i=0; i<maeakimax.length; i++){
       int max = Math.max(maeakimax[i], usiroakimax[i]);
       if(anser > max){
          anser = max;
       }
    }

      System.out.println(anser);
  }
}
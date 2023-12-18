import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    BufferedReader in = null;
    
    String line = "";
    
    String result = "";
    
    try{
      in = new BufferedReader(new InputStreamReader(System.in));
      line = in.readLine();
      
      String A = line.split(" ")[0];
      String B = line.split(" ")[1];
      String C = line.split(" ")[2];
      
      int a = Integer.parseInt(A, 10);
      int b = Integer.parseInt(B, 10);
      int c = Integer.parseInt(C, 10);
      
      int a_org = 0;
      int b_org = 0;
      int c_org = 0;
      
      ArrayList<Integer> la = new ArrayList<Integer>();
      ArrayList<Integer> lb = new ArrayList<Integer>();
      ArrayList<Integer> lc = new ArrayList<Integer>();
      
      la.add(a);
      lb.add(b);
      lc.add(c);
      
      boolean flg = false;
      
      int cnt = 0;
      
      if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1){
        result = "0";
      }else{
        while(true){
          a_org = a;
          b_org = b;
          c_org = c;

          cnt++;
          
          a = (b_org / 2) + (c_org / 2);
          b = (a_org / 2) + (c_org / 2);
          c = (a_org / 2) + (b_org / 2);
          
          for(int i = 0; i < la.size(); i++){
            if(la.get(i) == a && lb.get(i) == b && lc.get(i) == c){
              flg = true;
              break;
            }
          }
          
          if(flg == true){
            result = "-1";
            break;
          }
          
          if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1){
            result = "" + cnt;
            break;
          }
          
        }
      }
    
    }catch(Exception e){
      e.printStackTrace();
      result = "Error!";
    }finally{
      try{
        in.close();
      }catch(Exception e){
        result = "Error!";
      }
      System.out.println(result);
    }
  }
}
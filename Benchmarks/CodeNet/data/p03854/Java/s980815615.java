import java.io.*;
class Main
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder buf = new StringBuilder();
    
    String s = br.readLine();
    String[] param = {"","dream","dreamer","erase","eraser"};
    
    for(int i=1 ; i<5 ; i++){
      
        for(int j=0 ; j<5 ; j++){
          buf.setLength(0);
          buf.append(param[ i ]);
          buf.append(param[ j ]);
          String t = buf.toString();
          
          if(s.equals(t)){
            System.out.println("YES");
            return;
          }
        }
    }
    System.out.println("NO");
  }
}
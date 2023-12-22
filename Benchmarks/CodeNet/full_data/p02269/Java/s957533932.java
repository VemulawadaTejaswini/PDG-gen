import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args) throws IOException{
    //Scanner scan = new Scanner(System.in);
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    Set<String> a = new HashSet<String>();
    String[] s;

    for(int i=0 ; i<n ; i++){
      s = bf.readLine().split(" ");
      if(s[0].equals("insert")){
        a.add(s[1]);
      }
      else{
        if(a.contains(s[1])){
          System.out.println("yes");
        }
        else{
          System.out.println("no");
        }
      }
    }

  }
}


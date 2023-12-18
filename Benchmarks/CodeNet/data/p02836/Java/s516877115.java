import java.io.*;

class abcA {
  public static void main(String[] args) throws IOExeption {
    BufferedReader br = 
      new BufferedReader(new ImputStreamReader(System.in));
    String str = br.readLine();
    int len = str.length();
    int count = 0;
    for (int i=0;i<len;i++){
      if(i>=len-i)
        break;
      if(str.charAt(i)!=str.charAt(len-i))
        count++;
    }
    
    System.out.println(count);
  }
}
  
   
  
import java.io.*;

class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String word = reader.readLine(), tmp;
    char[] ch = word.toCharArray();

    for(int i=0; i<ch.length; i++){
      tmp = "";
      while(('a' <= ch[i] && ch[i] <= 'z') || ('A' <= ch[i] && ch[i] <= 'Z')){
        tmp += ch[i++];
      }

      if(tmp.equals("apple")){
        tmp = "peach";
      }else if(tmp.equals("peach")){
        tmp = "apple";
      }

      System.out.print(tmp+ch[i]);
    }
    System.out.println();
  }
}
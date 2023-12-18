import java.io.*;
class Codechef{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine();
    long T = Long.parseLong(br.readLine());
    char ch[] = new char[S.length()];
    ch[0] = S.charAt(0);
    for(int i=1;i<S.length()-1;i++){
      if(S.charAt(i-1) == S.charAt(i)){
        S = S.substring(0, i) + '0' + S.substring(i + 1); 
      }else if(S.charAt(i) == S.charAt(i+1)){
        S = S.substring(0, i+1) + '0' + S.substring(i + 2); 
      }else if((S.charAt(i-1) == S.charAt(i))&&(S.charAt(i) == S.charAt(i+1))){
        S = S.substring(0, i) + '0' + S.substring(i + 1); 
      }
    }
    if(S.charAt(0) == S.charAt(S.length()-1)){
      S = S.substring(0, 0) + '1' + S.substring(1); 
    }
    long count=0;
    for(int i=0;i<S.length();i++){
      if(S.charAt(i)=='0'||S.charAt(i)=='1'){
        count++;
      }
    }
    System.out.println(count*T);
    
  }
}
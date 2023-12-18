import java.io.*;
class pair_addition{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String slime = br.readLine();
    char a[]=slime.toCharArray();
    String ans = "";
    char f='\0';
    for(int i=1;i<a.length;i++){
      f = a[i-1];
      if(a[i]!=a[i-1]){
        ans=ans+f;
      }
    }
    f=a[a.length-1];
    ans = ans+f;
    System.out.println(ans.length());
  }
}
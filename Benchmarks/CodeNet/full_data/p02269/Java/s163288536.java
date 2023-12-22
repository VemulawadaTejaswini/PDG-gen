import java.io.*;
class Main{
  public static void main(String args[])throws Exception{
    int count = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String str;
    String [][] dic = new String[n][2];
    String search[] = new String[2];
    int j;
    for(int i = 0; i<n; i++){
      str = br.readLine();
      if(str.charAt(0)=='i'){
        dic[count] = str.split("\\s+");
        count++;
      }else{
        search = str.split("\\s+");

        for(j = 0; j<count; j++){
          if(search[1].equals(dic[j][1])){
            System.out.println("yes");
            break;
          }
        }
        if(j == count)System.out.println("no");
      }
    }

  }
}

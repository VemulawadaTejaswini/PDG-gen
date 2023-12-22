import java.io.*;
 
class Main
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int[] srchList = new int [Integer.parseInt(br.readLine())];
  int cnt = 0;
  int i,j;
 
  for (i = 2; i < srchList.length; i++)
  {
   if (srchList[i] == 1);
   else
   {
    cnt++;
    for (j = i + i; j < srchList.length; j+=i) srchList[j] = 1; 
   } 
  }
  System.out.println(cnt);
 }
}
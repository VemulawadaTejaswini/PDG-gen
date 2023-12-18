import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String str[]=new String[n];
    String strSorted[]=new String[n];
    int cnt=0;
    for(int i=0;i<n;i++){
      str[i]=sc.next();
      char[] ch=str[i].toCharArray();
      Arrays.sort(ch);
      strSorted[i]=new String(ch);
      for(int j=0;j<i;j++){
        if(strSorted[i].equals(strSorted[j])){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
    sc.close();
  }
}
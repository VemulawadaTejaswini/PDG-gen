import java.util.*;

public class Main{
  public static char chalpha(int n){
		char[] ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		return ch[n];
	}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int h=sc.nextInt(),w=sc.nextInt(),f=0;
    char c='';
    String[][] str=new String[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        str[i][j]=sc.next();
        if(str[i][j].equals("snuke")){
          f=i+1;
          c=chalpha(j);
        }
      }
    }
    System.out.println(c+""+f);
  }
}

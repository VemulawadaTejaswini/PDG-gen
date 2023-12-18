import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] a=sc.next().toCharArray();
    int e=0;
    for(char i='a';i<='z';i++){
      int f=0;
      for(int j=0;j<a.length;j++){
        
        if(a[j]==i){
          f++;
          e++;
          break;
        }
      }
      if(f==0){
        System.out.println(i);
      }
    }
    if(e==0){
      System.out.println("None");
    }
  }
}

import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] a=sc.next().toCharArray(),b=sc.next().toCharArray();
    int f=0;
    if(a.length>b.length){
      System.out.println("GREATER");
    }else if(a.length<b.length){
      System.out.println("LESS");
    }else{
      for(int i=0;i<a.length;i++){
        if(Integer.parseInt(a[i])>Integer.parseInt(b[i])){
          System.out.println("GREATER");
          f++;
          break;
        }else if(Integer.parseInt(a[i])<Integer.parseInt(b[i])){
          System.out.println("LESS");
          f++;
          break;
        }else{}
      }
      if(f==0){
        System.out.println("EQUAL");
      }
    }
  }
}

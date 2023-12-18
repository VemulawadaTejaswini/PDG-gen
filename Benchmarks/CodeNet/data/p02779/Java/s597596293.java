import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    char[] a=new char[n];
    int[] b=new int[n];
  	StringBuffer sb= new StringBuffer();
    for(int i=0;i<n;i++){
      a[i]=sc.next().charAt(0);
    	sb.append(a[i]);
    }
  	String str=sb.toString();
  	for(int i=0;i<n;i++){
  		b[i]=str.length()-str.replace(String.valueOf(a[i]),"").length();
  		if(b[i]>=2){
  			f++;
  			break;
  		}
  	}
  	if(f==0){
  		System.out.println("YES");
  	}else{
  		System.out.println("NO");
  	}
  }
}
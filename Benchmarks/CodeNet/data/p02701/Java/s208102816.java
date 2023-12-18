import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt();
  	String[] s= new String[a];
  	String[] w=new String[a];
  	for(int i=0;i<a;i++){
  		s[i]=sc.next();
  	}
  	w[0]=s[0];
  	int f=1;
  	int flag=0;
  	for(int i=1;i<a;i++){
  		int g=0;
  		while(w[g]!=null){
  			if(w[g].equals(s[i])){
  				flag=0;
  				break;
  			}
  			flag++;
  			g++;
  		}
  		if(flag!=0){
  			w[g]=s[i];
  			f++;
  		}
  	}
  	System.out.print(f);
  }
}
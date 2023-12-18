import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
  	long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
  	String[] s=new String[n],t=new String[n];
  	for(int i=0;i<n;i++){
  		s[i]=sc.next();
  		if(s[i].equals("AB")){
  			if(a>=b){
  				a--;
  				b++;
  				t[i]="B";
  				if(a<0){
  					f++;
  					break;
  				}
  			}else{
  				b--;
  				a++;
  				t[i]="A";
  				if(b<0){
  					f++;
  					break;
  				}
  			}
  		}else if(s[i].equals("BC")){
  			if(b>=c){
  				b--;
  				c++;
  				t[i]="C";
  				if(b<0){
  					f++;
  					break;
  				}
  			}else{
  				c--;
  				b++;
  				t[i]="B";
  				if(c<0){
  					f++;
  					break;
  				}
  			}
  		}else{
  			if(c>=a){
  				c--;
  				a++;
  				t[i]="A";
  				if(c<0){
  					f++;
  					break;
  				}
  			}else{
  				a--;
  				c++;
  				t[i]="C";
  				if(a<0){
  					f++;
  					break;
  				}
  			}
  		}
  	}
  	if(f==0){
  		System.out.println("Yes");
  		for(int i=0;i<n;i++){
  			System.out.println(t[i]);
  		}
  	}else{
  		System.out.print("No");
  	}
  }
}
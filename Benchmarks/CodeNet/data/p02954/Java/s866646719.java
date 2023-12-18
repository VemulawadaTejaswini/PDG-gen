import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int r=0,l=0;
    int[] a=new int[s.length()];
    for(int i=0;i<s.length();i++) {
    	if(s.substring(i, i+1).equals("R"))r++;
    	else {
    		a[i]=r;
    		r=0;
    	}
    }
    for(int i=s.length();i>=1;i--) {
    	if(s.substring(i-1, i).equals("L"))l++;
    	else {
    		a[i-1]=l;
    		l=0;
    	}
    }
    for(int i=0;i<s.length()-1;i++) {
    	if(s.substring(i, i+2).equals("RL")) {
    		int buff=a[i]+a[i+1];
    		if(buff%2==0) {
    			a[i]=buff/2;
    			a[i+1]=buff/2;
    		}else {
    			if(a[i]>a[i+1]) {
    				a[i]=buff/2+1;
    				a[i+1]=buff/2;
    			}else {
    				a[i]=buff/2;
    				a[i+1]=buff/2+1;
    			}
    			if((Math.max(a[i], a[i+1])-1)%2!=0) {
    				buff=a[i];
    				a[i]=a[i+1];
    				a[i+1]=buff;
    			}
    		}
    	}
    }
    for(int i=0;i<s.length();i++) {
    	System.out.print(a[i]+" ");
    }
  }
}

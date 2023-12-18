import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s=new StringBuilder(sc.next()),c=new StringBuilder();
    int q=sc.nextInt(),count=0;
    boolean flag=true;
    for(int i=0;i<q;i++) {
    	int t=sc.nextInt();
    	if(t==1) {
    		if(flag)flag=false;
    		else flag=true;
    		count++;
    	}else {
    		int f=sc.nextInt();
    		c=new StringBuilder(sc.next());
    		if(f==1) {
    			if(flag) {
    				s=c.append(s);
    			}else {
    				s.append(c);
    			}
    		}else {
    			if(flag) {
    				s.append(c);
    			}else {
    				s=c.append(s);
    			}
    		}
    		//c.delete(0, c.length());
    	}
    	//System.out.println(s);
    }
    if(count%2==0) {
    	System.out.println(s);
    }else {
    	System.out.println(s.reverse());
    }
  }
}

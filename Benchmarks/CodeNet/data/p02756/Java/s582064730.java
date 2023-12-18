import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s=new StringBuilder(sc.next());
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
    		String c=sc.next();
    		if(f==1) {
    			if(flag) {
    				s.insert(0, c);
    			}else {
    				s.append(c);
    			}
    		}else {
    			if(flag) {
    				s.append(c);
    			}else {
    				s.insert(0, c);
    			}
    		}
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

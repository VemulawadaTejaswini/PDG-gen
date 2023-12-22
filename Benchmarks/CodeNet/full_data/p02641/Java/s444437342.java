import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      	LinkedList<Integer> l=new LinkedList<>();
    	int x=sc.nextInt();
    	int n=sc.nextInt();
    	for(int i=0;i<n;i++) {
    		l.add(sc.nextInt());
    	}
    	for(int i=0;true;i++) {
    		if(!l.contains(x-i)) {
    			System.out.println(x-i);
    			break;
    		}
    		else if(!l.contains(x+i)) {
    			System.out.println(x+i);
    			break;
    		}
    	}
    }
}

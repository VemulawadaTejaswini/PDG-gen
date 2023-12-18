import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int count=0,sum=0;
    for(int i=0;i<s.length();i++) {
    	if(s.substring(i, i+1).equals("<")) {
    		count++;
    	}else {
    		count--;
    		if(count<0) {
    			sum++;
    			count++;
    		}
    	}
    	sum+=count;
    }
    if(s.substring(s.length()-1,s.length()).equals(">")) {
    	System.out.println(sum-count);
    }else {
    	System.out.println(sum);
    }
  }
}

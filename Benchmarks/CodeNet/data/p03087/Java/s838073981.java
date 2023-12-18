import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),q=sc.nextInt();
    String s=sc.next();
    for(int i=0;i<q;i++) {
        long count=0;
    	int l=sc.nextInt(),r=sc.nextInt();
    	String buff=s.substring(l-1,r);
   	 	//System.out.println(buff);
    	for(int j=buff.length();j>=2;j--) {
    		if(buff.substring(j-2, j).equals("AC"))count++;
    	}
    	System.out.println(count);
    }
  }
}

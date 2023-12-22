import java.util.Scanner;

class Dic{
	String word;
	public Dic(String str) {
		word=str;
	}
	public void Show() {
		System.out.println(word);
	}
}

public class Main{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int i,j,n,q,page=0;
       n=scan.nextInt();
       String com;
       String str;
       Dic[] dic=new Dic[n];
       for(i=0;i<n;i++) {
    	   com=scan.next();
    	   str=scan.next();
    	   switch (com) {
    		   case "insert":
    			   dic[page]=new Dic(str);
    			   page++;
    			   break;
    		   case "find":
    			   for(j=0;j<page;j++) {
    				   if(dic[j].word.equals(str)) {
    					   break;
    				   }
    			   }
    			   if(j<page) {
    				   System.out.println("yes");
    			   }
    			   else {
    				   System.out.println("no");
    			   }
    			   break;
    		   default:
    			   continue;
    	   }
       }
   }
}

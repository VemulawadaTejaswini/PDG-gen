import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String t=sc.next();
	  StringBuilder res=new StringBuilder();
	  for(int i=0;i<t.length()-1;i++) {
		  if(t.substring(i, i+1).equals("?")) {
			  if(t.substring(i+1, i+2).equals("D") || t.substring(i+1, i+2).equals("?") )res.append("P");
			  else res.append("D");
		  }else {
			  res.append(t.substring(i, i+1));
		  }
	  }
	  if(t.substring(t.length()-1, t.length()).equals("?"))res.append("D");
	  else res.append(t.substring(t.length()-1, t.length()));
	  System.out.println(res);
  }
}


import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		String s=sc.next();
        String t=sc.next();
  
  	String[] s1=s.split("");
  	String[] t1=t.split("");
  	String ans="";
  
    for(int c=0;c<n;c++){
      ans+=s1[c]+t1[c];
    }
 	

    	System.out.println(ans);
    }
}

import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		String s=sc.next();
  
  	String[] s1=s.split("");
  	int ans=0;
   
    for(int c=0;c<s.length()/2;c++){
      if(!s1[c].equals(s1[s.length()-1-c])){
      	ans++;
      }
    }
 	

    	System.out.println(ans);
    }
}

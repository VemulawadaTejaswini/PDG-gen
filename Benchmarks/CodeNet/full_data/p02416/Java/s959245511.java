import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
    	Scanner sc = new Scanner(System.in);
    	int i, ans;
    	String snum;
    	char[] c = new char[1000];
    	while(true){
        	snum = sc.next();
        	c = snum.toCharArray();
        	ans=0;
        	for(i=0;i<snum.length();i++){
            	ans+= c[i]-'0';
        	}
        	if(ans==0)break;
        	System.out.println(ans);
           }  
      }
 }



import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char Taps[]=new char[N.length()];
    boolean M=false;
    
    for(int i=0;i<N.length();i++){
    	Taps[i]=N.charAt(i);
    }
   for(int i=0;i<N.length();i++){
     	if(i%2==0){
        	if(Taps[i]=='L'){
            	M=true;
             	 break;
            }
        }else{
        	if(Taps[i]=='R'){
            	M=true;
             	 break;
        	}
        }
    }
    if(M==true){
    	System.out.println("No");
    }else{
    	System.out.println("Yes");
    }
  }
}
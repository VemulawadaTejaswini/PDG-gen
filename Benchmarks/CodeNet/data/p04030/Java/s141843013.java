    import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    String sS;
    	Scanner scan = new Scanner(System.in);
    sS=scan.nextLine();
    int j=0;
    
    char[] cS = sS.toCharArray();
    
    for(int i=0;i<sS.length();i++){
    	j=1;
    	if(cS[i]=='B' && i!=0){
    		while(cS[i-j]!='a'){
        		j++;
    			cS[i-j]='a';
    			
    		}
    	}
    }
    for(int i=0;i<sS.length();i++){
    	if(cS[i]!='a' && cS[i]!='B')System.out.print(cS[i]);
    }
    }
}
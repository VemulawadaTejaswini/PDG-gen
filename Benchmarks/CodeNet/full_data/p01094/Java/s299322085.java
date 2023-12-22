import java.util.*;
 
class Main {
	
    public static void main(String[] args) {
         
        Scanner cin=new Scanner(System.in);
        while(true) {
        	
        	int n=cin.nextInt();
        	if(n==0)break;
        	else if(n==1)System.out.println(cin.next());
        	
        	int v[]=new int[26];
        	int winv=0,secv=0,time=0; char winner=0;
        	
        	for(int i=1;i<=n;i++) {
        		winv=0;secv=0;winner=0;
        		String str=cin.next();char t[]=str.toCharArray();
        		v[t[0]-65]++;
        		
        		//当確チェック
        		//1位のチェック
        		
        		for(int j=0;j<26;j++) {
        			if(v[j]>winv) {
        				winv=v[j];winner=(char)(j+65);
        			}
        		}
        		
        		//System.out.println("WINNER : "+winner);
        		
        		//2位のチェック
        		for(int j=0;j<26;j++) {
        			if(j==winner-65)continue;
        			if(v[j]>secv) secv=v[j];
        		}
        		
        		if(winv>secv+(n-i)) {
        			time=i;
        			break;
        		}
        	}
        	if(winv==secv)System.out.println("TIE");
        	else System.out.println(winner+" "+time);
        }
        
    }
}

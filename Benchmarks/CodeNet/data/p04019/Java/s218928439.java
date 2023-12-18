    import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    	int N = 0;
    	int S=0;
    	int E=0;
    	int W=0;
        String st;
        char[] D = new char[10001];
    Scanner scan = new Scanner(System.in);
    
    st = scan.next();
    D = st.toCharArray();
    
    for(int i=0;i<st.length();i++){
    	switch(D[i]){
    	case 'N':
    		N++;
    		break;
    	case 'S':
    		S++;
    		break;
    	case 'E':
    		E++;
    		break;
    	case 'W':
    		W++;
    		break;
    	}
    }
    	
    	if(N>0 && S>0){
    		if(E*W==0 && E+W>0){
    			System.out.println("No");
    			return;
    		}else{
    			System.out.println("Yes");
    			return;
    		}
    	}
    	
    	if(E>0 && W>0){
    		if(N*S==0 && N+S>0){
    			System.out.println("No");
    			return;
    		}else{
    			System.out.println("Yes");
    			return;
    		}
    	}
    	
    		
    }
    
}
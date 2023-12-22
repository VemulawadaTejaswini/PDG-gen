import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1155().doIt();
    }
    class aoj1155{
    	Stack<Integer> st = new Stack<Integer>();
    	int stack(int P,int Q,int R,char ctr[]){
    		int cnt = 0;
    		for(int i = 0;i < ctr.length;i++){
    			if(ctr[i] == ')'){
    				int result = st.pop();
    				while(true){
    					int num = st.pop();
    					if(num == -1){
    						st.push(result);
    						break;
    					}
    					else if(num == -2){
    						if(result == 0)result = 2;
    						else if(result == 1)result = 1;
    						else result = 0;
    					}else if(num == -3){
    						int num2 = st.pop();
    						result = ((result|num2) == 3 ? 2:(result|num2));
    					}else if(num == -4){
    						int num2 = st.pop();
    						result = result == num2 ? result:(result+num2) == 3 ? 1:0;
    					}
    				}
//    				System.out.println(st.toString());
//    				System.out.println(result);
    			}else{
    				//??°?????????
    				if(ctr[i] == '('){
    					if(cnt % 2 == 1)st.push(-2);
    					cnt = 0;
    					st.push(-1);
    				}
    				else if(ctr[i] == 'P'){
    					if(cnt % 2 == 1){
    						if(P == 0)st.push(2);
    						else if(P == 1)st.push(1);
    						else st.push(0);
    					}else st.push(P);
    					cnt = 0;
    				}
    				else if(ctr[i] == 'Q'){
    					if(cnt % 2 == 1){
    						if(Q == 0)st.push(2);
    						else if(Q == 1)st.push(1);
    						else st.push(0);
    					}else st.push(Q);
    					cnt = 0;
    				}
    				else if(ctr[i] == 'R'){
    					if(cnt % 2 == 1){
    						if(R == 0)st.push(2);
    						else if(R == 1)st.push(1);
    						else st.push(0);
    					}else st.push(R);
    					cnt = 0;
    				}
    				else if(ctr[i] == '-'){
    					cnt++;
    				}
    				else if(ctr[i] == '+')st.push(-3);
    				else if(ctr[i] == '*')st.push(-4);
    				else if(ctr[i] == '0'){
    					if(cnt % 2 == 1)st.push(2);
    					else st.push(0);
    					cnt = 0;
    				}
    				else if(ctr[i] == '1'){
    					st.push(1);
    					cnt = 0;
    				}
    				else if(ctr[i] == '2'){
    					if(cnt % 2 == 1)st.push(0);
    					else st.push(2);
    					cnt = 0;
    				}
    			}
    		}
    		return st.pop();
    	}
    	void doIt(){
    		while(true){
    			String str = sc.next();
    			if(str.equals("."))break;
    			int ans = 0;
    			for(int i = 0;i < 3;i++){
    				for(int j = 0;j < 3;j++){
    					for(int k = 0;k < 3;k++){
//    						System.out.println("+++++++");
    						if(stack(i,j,k,str.toCharArray()) == 2)ans++;
    					}
    				}
    			}
    			System.out.println(ans);
    		}
    	}
     }
}
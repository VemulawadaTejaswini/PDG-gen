import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
    	int x=sc.nextInt();
    	boolean flg=true;
    	if(x==1 || x==2*N-1) flg=false;
    	int[] outputArray = new int[2*N-1];
    	System.out.println(flg?"Yes":"No");
    	if(flg) {
    		if(N==2) {
    			outputArray[0]=1;
    			outputArray[1]=2;
    			outputArray[2]=3;
    		}
//    		else if(N==3) {
//    			if(x==2) {
//    				outputArray[0]=3;
//    				outputArray[1]=5;
//    				outputArray[2]=2;
//    				outputArray[3]=1;
//    				outputArray[4]=4;
//    			}else if(x==3){
//    				outputArray[0]=2;
//    				outputArray[1]=5;
//    				outputArray[2]=3;
//    				outputArray[3]=1;
//    				outputArray[4]=4;
//
//    			}else{
//    				outputArray[0]=2;
//    				outputArray[1]=5;
//    				outputArray[2]=4;
//    				outputArray[3]=1;
//    				outputArray[4]=3;
//    			}
//    		}
    		else {
    			for(int i=0; i<outputArray.length; i++) {
    				outputArray[i]=i+1;
    			}
    			if(x==2) {
            		swap(outputArray,N-1,2*N-1);
            		swap(outputArray,N,x);
            		swap(outputArray,N+1,1);
            	}else{
            		swap(outputArray,N-2,2);
            		swap(outputArray,N-1,2*N-1);
            		if(x==N-2){
            			swap(outputArray,N,2);
            		}else if(x==N-1){
            			swap(outputArray,N,2*N-1);
            		}else {
            			swap(outputArray,N,x);
            		}
            		swap(outputArray,N+1,1);
            	}
    		}
    		output(outputArray);
    	}

    }
public class Main{
    public static void main(String[] args){
    	int a;
    	int b;
    	int numa,numb,numc=0;
    	int digit[] = {0,0,0};
    	
    	for(int i=0;i<3;i++){
    		numa=a;
    		numb=b;
    		numc=numa+numb;
    		if(numc<10){
    			digit[i]=1;
    		} else if(numc<100){
    			digit[i]=2;
    		} else if(numc<1000){
    			digit[i]=3;
    		} else if(numc<10000){
    			digit[i]=4;
    		}
    	}
    	System.out.println(digit[0]);
    	System.out.println(digit[1]);
    	System.out.println(digit[2]);
    }
}
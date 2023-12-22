import java.util.Scanner;
public class main {
	Scanner sc = new Scanner(System.in);
    int m,k,s,t;
	int kei;
	
    public void kei(){
    	m = sc.nextInt();
    	while(m!=0){
            k = sc.nextInt();
            for(int i=0;i<=k-1;i++){
            	s = sc.nextInt();
            	t = sc.nextInt();
            	kei = kei+t-s;
            }
        	if(kei>m){
        		System.out.println("OK");
        	}else{
        		System.out.println(m-kei);
        	}
        	kei = 0;
        	m =sc.nextInt();
    		
    	}
    	
    }
	public static void main(String[] args) {
		Main t = new Main();
		t.kei();
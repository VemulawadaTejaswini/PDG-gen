import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new A().doIt();
    }
    class A{
    	void ans(int a[],int n,int p){
    		int cup = p;
    		while(true){
    			int cnt = 0;
    			for(int i = 0;i < n;i++){
    				if(cup == 0){
    					cup = a[i];
    					a[i] = 0;
    				}else{
    					a[i] = a[i] + 1;
    					cup = cup - 1;
    				}
    			}
    			for(int i = 0;i < n;i++){
//    				System.out.print(a[i]+" ");
    				if(a[i] != 0){
    					cnt++;
    				}
    			}
//    			System.out.println();
    			if(cnt == 1 && cup == 0)return;
    		}
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			int p = sc.nextInt();
    			if(n + p == 0)break;
    			int a[] = new int [n];
    			ans(a,n,p);
    			for(int i = 0;i < n;i++){
    				if(a[i] != 0){
    					System.out.println(i);
    				}
    			}
    		}
    	}
    }
}
import java.util.Scanner;
public class Main{
	
	public void solve(){
        Scanner sc = new Scanner(System.in);
		
		int k;
		int dou=0;
		int izyo=1;
		int n = sc.nextInt();
		
	    while(n!=0){
			for(int i=0;i<n;i++){
				k = sc.nextInt();
				
				if(k>=2){
					izyo++;
				}
				if(k==1){
					dou++;
				}
			}
			if(izyo>=2){
				System.out.println(dou+izyo);
			}else{
				System.out.println("NA");
			}
			
			izyo = 1;
			dou = 0;
			n = sc.nextInt();
	    }
	}
			
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}
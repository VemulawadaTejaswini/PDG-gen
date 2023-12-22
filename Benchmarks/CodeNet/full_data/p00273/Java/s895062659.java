import java.util.Scanner;

public class Main{
	    	int ninzu,nyuyoku,puru,kingaku,kingaku2,goukei,waribiki;
    
	public void solve(){
	    	Scanner sc=new Scanner(System.in);
		    ninzu=sc.nextInt();
	
		for(int i=1;i<=ninzu;i++){
			kingaku=sc.nextInt();
			kingaku2=sc.nextInt();
			nyuyoku=sc.nextInt();
			puru=sc.nextInt();	
				
	     goukei=(kingaku*nyuyoku+kingaku2*puru);
		
		if(nyuyoku>=5&&puru>=2){
		  waribiki=(kingaku*nyuyoku+kingaku2*puru)*4/5;
		}else {
			if(nyuyoku<5){
				nyuyoku=5;
			}if(puru<2){
				puru=2;
			}
			
			waribiki=(kingaku*nyuyoku+kingaku2*puru)*4/5;
				
			}if(goukei>waribiki){
				goukei=waribiki;
			}
			System.out.println(goukei);
	    }
		}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}
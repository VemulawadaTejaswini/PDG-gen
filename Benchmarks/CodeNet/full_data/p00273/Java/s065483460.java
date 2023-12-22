import java.util.Scanner;

class Main{
		int ninzu,nyuyoku,puru,kingaku,kingaku2,goukei;
        double waribiki;
    public void solve(){
        Scanner sc=new Scanner(System.in);
		    ninzu=sc.nextInt();
	
		for(int i=1;i<=ninzu;i++){
			kingaku=sc.nextInt();
			kingaku2=sc.nextInt();
			nyuyoku=sc.nextInt();
			puru=sc.nextInt();	
				
		if(nyuyoku>=5&&puru>=2){
			waribiki=(kingaku*nyuyoku)*0.8+(kingaku2*puru)*0.8;;
			System.out.println(waribiki);
		}else {
			goukei=kingaku*nyuyoku+kingaku2*puru;
	    	System.out.println(goukei);
        }
    }
    }
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}
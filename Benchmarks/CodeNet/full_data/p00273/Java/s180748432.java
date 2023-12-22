import java.util.Scanner;
class Main{
	int nisuu;
	int nk,pk,nm,pm;
	int cnt;
	int x,y;
	int ryokin;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		
		nisuu = sc.nextInt();
		for(cnt=0; cnt<nisuu; cnt++){
			nk=sc.nextInt();
			pk=sc.nextInt();
			nm=sc.nextInt();
			pm=sc.nextInt();
			
			ryokin = nk*nm+pk*pm;
			if(nm>=5 && pm>=2){
			ryokin = (nk*nm+pk*pm)*8/10;
			
			}else{
				if(nm<5){
					nm=5;
				}
				if(pm<2){
					pm=2;
				}
			int yobun = (nk*nm+pk*pm)*8/10;
			
			if(ryokin>yobun){
				ryokin = yobun;
			}
		 System.out.println(ryokin);
		}
		}
	}
	
	public static void main(String[]args){
		Main obj = new Main();
		obj.solve();
		
	}
}
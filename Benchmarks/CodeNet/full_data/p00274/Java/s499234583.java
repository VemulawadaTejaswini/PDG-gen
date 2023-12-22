import java.util.Scanner;
public class Main{
	int syu;
	int nok;
	int chaka;
	int gokei;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		syu = sc.nextInt();
		while(syu!=0){
			gokei = 0;
			chaka = 1;
			for(int i=1;i<=syu;i++){
				nok = sc.nextInt();
				if(nok>=2){
					gokei = gokei+1;
				}
				if(nok>0){
					chaka = chaka+1;
				}
			}
			
		
			if(gokei>0){
				System.out.println(chaka);
			}else{
				System.out.println("NA");
			}
			syu = sc.nextInt();
		}
	}
	public static void main(String[]args){
		Main obj = new Main();
		obj.solve();
	}
}
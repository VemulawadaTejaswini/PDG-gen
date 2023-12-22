import java.util.Scanner;
public class Main{
	int syu;
	int nok[]=new int[100];
	int chaka;
	int gokei;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		syu = sc.nextInt();
		while(syu!=0){
			gokei = 0;
			for(int i=1;i<=syu;i++){
				nok[i] = sc.nextInt();
				if(nok[i]>=2){
					gokei = gokei+1;
				}
			}
			chaka=1;
			for(int n=1;n<=syu;n++){
				if(nok[n]>0){
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
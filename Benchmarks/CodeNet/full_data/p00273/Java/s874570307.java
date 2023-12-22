import java.util.Scanner;
class Main{
 
    public void solve(){
        Scanner sc = new Scanner(System.in);
		int num, nyuumai, pumai;
		double nyuuryou, puryou, total;
		num = sc.nextInt();
		for(int i = 0; i < num; i++){
			nyuuryou = sc.nextInt();
			puryou = sc.nextInt();
			nyuumai = sc.nextInt();
			pumai = sc.nextInt();
			
			if(nyuumai >= 6){
				pumai = 2;
				nyuuryou = nyuuryou - (nyuuryou * 0.2);
				puryou = puryou - (puryou * 0.2);
			}else if(nyuumai >= 5 && pumai >= 2){
			         nyuuryou = nyuuryou - (nyuuryou * 0.2);
				     puryou = puryou - ( puryou * 0.2);
		        	}
			
			total = (nyuumai * nyuuryou) + (pumai * puryou);
			
			System.out.print((int)total);
			System.out.println();
		}
	   	
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}
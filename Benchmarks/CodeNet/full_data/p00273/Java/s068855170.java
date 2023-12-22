import java.util.Scanner;
public class Main{
	
    public void solve(){
		Scanner sc=new Scanner(System.in);
		int niti,nyuryo,puluryo,nyumai,pulumai,nyukei,pulukei,goukei;
		niti=sc.nextInt();
		for(int i=0; i<niti; i++){
		
		nyuryo=sc.nextInt();
		puluryo=sc.nextInt();
		nyumai=sc.nextInt();
		pulumai=sc.nextInt();
		nyukei=nyuryo*nyumai;
		pulukei=puluryo*pulumai;
		goukei=nyukei+pulukei;
		if(nyumai<=5){
			nyumai=5;
		}
		if(pulumai<=2){
			pulumai=2;
		}
		nyukei=nyuryo*nyumai;
		pulukei=puluryo*pulumai;
		int goukei2=nyukei+pulukei;
		goukei2=goukei2*4/5;
		if(goukei>goukei2 ){
			System.out.println(goukei2);
			}else{
				System.out.println(goukei);
			}
		}
    }

			
      public static void main(String[] args){
      Main obj = new  Main(); 
      obj.solve();      
  }
}
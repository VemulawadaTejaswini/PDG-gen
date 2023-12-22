import java.util.Scanner;
public class Main2_278{
	
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
		if(nyumai>=5 && pulumai>=2 ){
			goukei=goukei*4/5;
			System.out.println(goukei);
	}else {
		System.out.println(goukei);
	}
}
}
      public static void main(String[] args){
      Main2_278 obj = new  Main2_278(); 
      obj.solve();      
  }
}
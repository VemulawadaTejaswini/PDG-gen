import java.util.Scanner;

class Main2{
        int tiket[]={0,6000,4000,3000,2000};
		int t,n,uriage;
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
		
        for(int i=0;i<4;i++){
		t=sc.nextInt();
		n=sc.nextInt();
	    uriage=tiket[t]*n;
		System.out.println(uriage);
        }
    }
	public static void main(String[]args){
		Main2 obj=new Main2();
		obj.solve();
	}
}
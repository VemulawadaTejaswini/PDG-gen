import java.util.Scanner;

public class Main {
	int n;
	String s;
	String[] sw;
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=sc.next();
		sw=new String[n];
		
		sw[0]="S";//最初が羊の時
		//パターン１
		if(s.charAt(0)=='o'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン２
		if(s.charAt(0)=='o'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン３
		if(s.charAt(0)=='x'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン４
		if(s.charAt(0)=='x'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン５
		sw[0]="W";//最初が狼の時
		if(s.charAt(0)=='o'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン６
		if(s.charAt(0)=='o'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン７
		if(s.charAt(0)=='x'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		//パターン８
		if(s.charAt(0)=='x'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		System.out.println("-1");
		
	}
	public void solve2(){
		for(int i=1;i<n-1;i++){
			if((sw[i]=="S"&&s.charAt(i)=='o')||(sw[i]=="W"&&s.charAt(i)=='x')){
				sw[i+1]=sw[i-1];
			}else{
				if(sw[i-1]=="S")sw[i+1]="W";
				if(sw[i-1]=="W")sw[i+1]="S";
			}
		}
	}
}
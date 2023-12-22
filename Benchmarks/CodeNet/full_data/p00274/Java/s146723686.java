//2721佐藤 充祥　問4
import java.util.Scanner;
 class Main4{
 	
 	
	
	public void solve(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int x =sc.nextInt();
			if(x==0)
			break;//ループを抜ける
			int a = 0;
			boolean flag=false;//真偽の変数
			for(int s=0;s<x;s++){
				int r = sc.nextInt();
				if(r>0) a++;
				if(r>1) flag = true;
			}
			if(!flag) System.out.println("NA");
			else System.out.println(a+1);
		}
	}

	public static void main(String[] args){
		Main4 obj = new Main4();
		obj.solve();
	}
 }
	
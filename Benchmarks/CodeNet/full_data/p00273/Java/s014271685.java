import java.util.Scanner;
public class huro{
	 public void solve(){
	 	int n,x,y,b,p,go,wgo;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			x = sc.nextInt();
			y = sc.nextInt();
		    b = sc.nextInt();
		    p = sc.nextInt();
		    go = x*b+y*p;
			if(b<=5){
				b=5;
			}
		    if(p<=2){
				p=2;
		    }
			wgo =(x*b+y*p)/10*8;
			if(go<wgo){
				System.out.println(go);
			}else{
		    	System.out.println(wgo);
			}
		}
	 }
    public static void main(String[] args){
        huro obj = new huro();
        obj.solve();
    }
}
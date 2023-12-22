import java.util.Scanner;
    public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
		int n,k,kk;
		n = sc.nextInt();
		kk = 0;
		while(n!=0){
        	for(int i=0;i<n;i++){
				k = sc.nextInt();
				if(kk<k){
					kk = k ;
				}
        	}
		if(kk>=2){
			n = n+1;
			System.out.println(n);
        }else{
			System.out.println("NA");
        }
		n = sc.nextInt();
		kk = 0;
		}
    }
    public static void main(String[] args){
            Main obj= new Main();
            obj.solve();
    }
	}
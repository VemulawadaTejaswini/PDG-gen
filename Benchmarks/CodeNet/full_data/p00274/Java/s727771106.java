import java.util.Scanner;
    public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
		int n,k,kk,goukei;
		n = sc.nextInt();
		kk = 0;
		goukei = 0;
		while(n!=0){
        	for(int i=0;i<n;i++){
				k = sc.nextInt();
				if(kk<k){
					kk = k ;
					goukei = k+goukei;
				}
        	}
		if(kk>=2){
			if(goukei>=2){
				System.out.println("2");
			}else if(n==1){
				System.out.println("2");
			}else{
				System.out.println("3");
			}
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
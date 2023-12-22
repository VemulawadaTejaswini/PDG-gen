public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			long X = sc.nextLong();
			long K = sc.nextLong();
			long D = sc.nextLong();
			long absX = Math.abs(X);
			long absD = Math.abs(D);
            long timesk = absX/absD;
            long amari = absX%absD;
            
            if(timesk>K) {
            	System.out.println(absX-K*D);
            	return;
            }
			
            long check = (K-timesk)%2;
            
            if(check==1) {
            	System.out.println(D-amari);
            }else {
            	System.out.println(amari);            	
            }			
	}	
}
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();

		long[] T = new long[n];
		long[] A = new long[n];
		for(int i = 0;i < n;i++){
			T[i] =sc.nextLong();
			A[i] = sc.nextLong();
		}

		long takahasi = T[0];
		long aoki = A[0];
	//	System.out.println(" taka " +takahasi + " aoki " +aoki);

		for(int i = 1;i < n;i++){
			if(aoki*T[i] != takahasi*A[i]){
				if(A[i] < aoki && T[i] < takahasi){
					long aa = 0;
					long tt = 0;
					if(aoki%A[i] == 0){
						aa = aoki/A[i];
					}else{
						aa = aoki/A[i]+1;
					}
					if(tt%T[i] == 0){
						tt = takahasi/T[i];
					}else{
						tt = takahasi/T[i]+1;
					}
					long x = Math.max(aa, tt);
					aoki = A[i]*x;
					takahasi = T[i]*x;
				}else if(A[i] >= aoki && T[i] >= takahasi){				//どっちもおっきい
					aoki = (long)A[i];
					takahasi = (long)T[i];
					
				}else if(T[i] >= takahasi){
					
					long kake = ((aoki / A[i]) + 1);
					if(aoki % A[i] == 0){
						kake = aoki / A[i];
					}
					aoki  = A[i]*kake;
					takahasi = T[i]*kake;
				}else{
					long kake = (( takahasi / T[i]) + 1) ;
					if(takahasi % T[i] == 0){
						kake = takahasi / T[i];
					}
					aoki  = A[i]*kake;
					takahasi = T[i]*kake;
				}

			}
			
		//	System.out.println(" taka " +takahasi + " aoki " +aoki);
		}


		System.out.println(takahasi+aoki);

	}
}
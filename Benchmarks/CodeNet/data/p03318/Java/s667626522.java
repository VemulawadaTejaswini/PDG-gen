import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long k = sc.nextLong();
		//
		//	
		//		for(int i = 1000;i <= 2000;i++){
		//			int S = 0;
		//			if(i <= 9){
		//				S = i;
		//			}else if(i > 9 && i < 100){
		//				S = i/10;
		//				S = S + (i - S*10 );
		//			}else{
		//				S = i/100;
		//				int SS = 0;
		//				SS = i - S*100;
		//				S = S + (SS/10) + (SS - SS/10*10);
		//			}
		//				System.out.println("i " + i+" S "+ S+" sunuke "+ (double)((double)i / S));
		//			
		//		}
		long count = 0;
		long sunukenum = 1l;

		while(true){
			if(count == k){
				return;
			}
			System.out.println(sunukenum);
		
			int keta = String.valueOf(sunukenum).length();
			long sunuke = 1000000000*10000000;
			long karinext = 0l;
			for(int i = 0;i <= keta;i++){
				long karin = sunukenum + (long)Math.pow(10, keta-i);
//				System.out.println("karin "+karin);
				long karisunuke = karin / sum(karin);
				if(sunuke >= karisunuke){
					sunuke = karisunuke;
					karinext = karin;
				}	
			}
			sunukenum = karinext;

			
			
			count++;
			
		}



	}
	static long sum(long n){
		long l =  String.valueOf(n).length();
		long s = 0;
		for(int i = 0;i < l;i++){
			s +=  (long)(n/Math.pow(10, l-1-i));
			n -= (long)Math.pow(10, l-1-i) *(long)(n/Math.pow(10, l-1-i));
		}
		
		return s;
		
		
	}

}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


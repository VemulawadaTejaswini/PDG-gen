public class AOJ1224{
	void run(String num){
		int max=0;
		Integer[] f1=new Integer[54];
		for(int i=0;i<54;i++) f1[i] = i*i*i;
		Integer[] f2=new Integer[96];
		for(int i=0;i<54;i++) f2[i] = i*(i+1)*(i+2)/6;
		for(Integer i=0;i<54;i++){
			for(Intgeter j=0;j<96;j++){
				if(f1[i]+f2[j]<=num) max=Math.max(max,f1[i]+f2[j]);
			}
		}
		System.out.println(max);
	}

	public static void mian(String[] args){
		AOJ1224 app = new AOJ1224();
		for(Integer i=0;;i++){
			if(args[i].equals(0)) break;
			else app.run(args[i]);
		}
	}
}

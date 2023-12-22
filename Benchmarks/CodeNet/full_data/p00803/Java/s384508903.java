import java.util.Scanner;
class AOJ1224{
	void run(){
		int tiaojian;
		Integer[] f1=new Integer[54];
		for(int i=0;i<54;i++) f1[i] = i*i*i;
		Integer[] f2=new Integer[96];
		for(int i=0;i<96;i++) f2[i] = i*(i+1)*(i+2)/6;
		Scanner n = new Scanner(System.in);
		for(;;){
		Integer num = n.nextInt();
		// System.out.println(num);
		if (num.equals(0)) break;
		int max=0;
		for(Integer i=0;i<54;i++){
			for(Integer j=0;j<96;j++){
				tiaojian=f1[i]+f2[j];
				if(tiaojian<=num) max=Math.max(max,tiaojian);
			}
		}
		System.out.println(max);
		}
	}

	public static void main(String[] args){
		AOJ1224 app = new AOJ1224();
		app.run();
	}
}


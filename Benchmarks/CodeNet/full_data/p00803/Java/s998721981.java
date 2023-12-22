import java.util.Scanner;
class AOJ1224{
	void run(String n,Integer[] f2,Integer[] f1){
		int max=0;
    Integer num = Integer.parseInt(n);
		for(Integer i=0;i<54;i++){
			for(Integer j=0;j<96;j++){
				if(f1[i]+f2[j]<=num) max=Math.max(max,f1[i]+f2[j]);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args){
		AOJ1224 app = new AOJ1224();
    Integer[] f1=new Integer[54];
		for(int i=0;i<54;i++) f1[i] = i*i*i;
		Integer[] f2=new Integer[96];
		for(int i=0;i<96;i++) f2[i] = i*(i+1)*(i+2)/6;

    for(int i=0;i<args.length;i++){
      if(args[i].equals(0)) break;
      else app.run(args[i],f2,f1);
    }
	}
}


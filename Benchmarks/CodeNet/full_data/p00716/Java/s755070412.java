import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int init;
	int year;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int set = scan.nextInt();
			for(int data = 0;data < set;data++){
				init = scan.nextInt();
				year = scan.nextInt();
				int max = 0;
				int n = scan.nextInt();
				int type;
				double r;
				int f;
				for(int i = 0;i < n;i++){
					type = scan.nextInt();
					r = scan.nextDouble();
					f = scan.nextInt();
					if(type == 1){
						max = Math.max(max,simp(r,f));
					}else if(type == 0){
						max = Math.max(max,comp(r,f));
					}
				}
				System.out.println(max);
			}
		}
	}
	public int simp(double r,int f){
		int a;
		int i;
		for(a = init,i=0;i<year;i++){
			a += ((int)(r*a) - f);
		}
		return a;
	}
	public int comp(double r,int f){
		int a;
		int b;
		int i;
		int total;
		for(a=init,i=0,total=0,b=0;i<year;i++){
			b = (int)(a*r);
			a -= f;
			total += b;
		}
		return a + total;
	}
}
public class Main {
	public static void main(String args[]){
		int x,a,b;
		x = Integer.parseInt(args[0]);
		a = Integer.parseInt(args[1]);
		b = Integer.parseInt(args[2]);
		if(a>=b){
			System.out.println("delicious");
		}
		if(a+x>=b && a<b){
			System.out.println("safe");
		}
		if(a+x<b){
			System.out.println("dangerous");
		}
	}
}
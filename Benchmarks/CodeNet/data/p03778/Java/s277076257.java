package spring21;

public class ABC056_B {
	public static void main(String[] args){
		int W=3,a=2,b=6;
		if(Math.abs(b-a)<W){
			System.out.println("0");
		}
		else{
			System.out.println(b-(a+W));
		}
	}
}
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run(){
		Scanner sc =  new Scanner(System.in);
		while(true){
			if(!sc.hasNext()){
				break;
			}
			int a = sc.nextInt();
			int[] b = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
			for(int i=0; i < b.length; i++){
				//System.out.println("a is " + a +": b is " + b[i]);
				if(a >= b[i]){
					System.out.print(b[i]+" ");
				}
			}
			System.out.println("");
		}
	}
}
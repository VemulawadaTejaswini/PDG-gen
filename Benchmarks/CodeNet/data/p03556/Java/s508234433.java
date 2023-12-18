public class Main {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = 0;
		for(int i=1; i*i<=1000000000; i++){
			if(i*i<x){
				y = i*i;
			}else if( i*i ==x){
				System.out.println(x);
				y = -1;
				break;
			}else if(i*i > x){
				break;
			}
		}

		if( y != -1){
			System.out.println(y);
		}

	}

}

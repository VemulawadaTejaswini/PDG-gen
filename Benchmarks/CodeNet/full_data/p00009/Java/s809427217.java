import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int a=sc.nextInt();
			System.out.println(kosu(a));
		}

	}


	//a????´???°??????????????????
	public static boolean hantei(int a){
		if(a==1){
			return false;
		}else if(a==2){
			return true;
		}else{
			for(int i=2; i<=Math.sqrt(a); i++){
				if(a%i==0){

					return false;

				}
			}
			return true;
		}

	}

	public static int kosu(int a){
		int count=0;
		for(int i=2; i<=a; i++){
			if(hantei(i)){
				count++;
			}

		}

		return count;
	}
}
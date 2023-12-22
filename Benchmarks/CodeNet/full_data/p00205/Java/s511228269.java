import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int[] dataset = new int[5];
			while((dataset[0] = scan.nextInt()) !=0){
				boolean[] janken = new boolean[3];
				for(int i = 0 ; i < janken.length;i++)janken[i] = false;
				janken[dataset[0] -1] = true;
				for(int i = 1; i < dataset.length;i++){
					dataset[i] = scan.nextInt();
					janken[dataset[i] -1] = true;
				}
				if(check(janken)){
					for(int i = 0; i < 5; i++){
						System.out.println("3");
					}
				}else{
					for(int i = 0 ; i < 5;i++){
						if(janken[point(dataset[i] + 1)] == true){
							System.out.println("2");
						}else{
							System.out.println("1");
						}
					}
				}
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
	public static boolean check(boolean[] janken){
		for(int i = 0 ; i < janken.length;i++){
			if(janken[point(i)] == true && janken[point(i+1)] == false && janken[point(i+2)] == false){
				return true;
			}
		}
		if( janken[0] == true && janken[1] == true && janken[2] == true)
			return true;
		return false;
	}
	public static int point(int i){
	return i%3;
	}
}
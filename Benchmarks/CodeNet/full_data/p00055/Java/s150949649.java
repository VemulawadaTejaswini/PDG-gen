import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				double num = sc.nextFloat();
				double sum = num;
				for(int i = 0; i <9; i++){
					if(i%2==0){
						num = num *2;
					}else{
						num = num /3;
					}
					sum+=num;
				}
				
			System.out.println(sum);
			}
		}
	}
	
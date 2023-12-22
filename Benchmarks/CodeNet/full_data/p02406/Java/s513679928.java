import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//?????????
		StringBuilder out = new StringBuilder();
		int n = scan.nextInt();
		
		//??????
		for(int i = 1; i <= n ; i++){
			if(i % 3 == 0){
				out.append(" " + i);
			}//if 
			else {
				int num = i;
				while (num != 0){
					if(num % 10 == 3){
						out.append(" " + i);
						break;
					}else{
						num = num / 10;
					}//else
				}//while
			}//else
		}//for
		//??????
		System.out.println(out);
	}
}
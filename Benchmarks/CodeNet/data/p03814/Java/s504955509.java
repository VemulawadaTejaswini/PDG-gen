import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] pa = a.split("");
		int countA = 0;
		int countZ = 0;
		for(int i=0;i<pa.length;i++){
			if(pa[i].equals("A") == true && countA == 0){
				countA++;
				countZ++;
			}else if(pa[i].equals("Z") == false && countA == 1){
				countZ++;
			}else if(pa[i].equals("Z") == false && countA == 1){
				countZ++;
			}else if(pa[i].equals("Z") == true && countA == 1){
				countZ++;
				System.out.println(countZ);
			}
		}
		
	}
}
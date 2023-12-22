import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int weight10 = sc.nextInt(),sum = 0;
			String weight2 = Integer.toBinaryString(weight10);
			char a;
			for(int i = 0;i < weight2.length() - 1;i++){
				a = weight2.charAt(i);
				if(a == '1'){
					System.out.print((int)Math.pow(2,i) + " ");
				}
			}
			System.out.print((int)Math.pow(2,weight2.length() - 1));
			System.out.println();
		}
	}
}
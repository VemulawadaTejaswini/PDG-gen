import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String line = scan.nextLine();
		String[] array = line.split(" ");
		for(int i = 0; i<array.length-1; i++){
			for(int j = i+1; j<array.length; j++){
				if(Integer.parseInt(array[j])>Integer.parseInt(array[i])){
					int x = Integer.parseInt(array[j]);
					array[j] = array[i];
					array[i] = String.valueOf(x);
				}
			}
			if(i == 0){
			System.out.print(array[i]);
			}else{
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
	}
}
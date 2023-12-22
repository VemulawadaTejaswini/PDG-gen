import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.length() == 1){
				count++;
				continue;
			}
			int i = 0;
			int j = str.length() - 1;
			while(true){
				if(i >= j){
					count++;
					break;
				}
				Character ch1 = new Character(str.charAt(i));
				Character ch2 = new Character(str.charAt(j));
				if(!ch1.equals(ch2)){
					break;
				}
				i++;
				j--;
			}
		}
		System.out.println(count);
	}
}
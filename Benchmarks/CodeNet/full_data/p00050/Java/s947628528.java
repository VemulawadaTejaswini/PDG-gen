import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		for(int i=0;i<str.length;i++){
			if(str[i].equals("apple")){
				str[i] = "peach";
			}else if(str[i].equals("apple.")){
				str[i] = "peach.";
			}else if(str[i].equals("peach")){
				str[i] = "apple";
			}else if(str[i].equals("peach.")){
				str[i] = "apple.";
			}
		}
		
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]);
			if(i < str.length-1){
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
}
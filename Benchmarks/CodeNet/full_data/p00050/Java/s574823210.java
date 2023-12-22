import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(" ");
			for(int i = 0;i < str.length;i++){
				if(i != str.length-1){
					if(str[i].equals("apple")){
						str[i] = "peach";
					}else if(str[i].equals("peach")){
						str[i] = "apple";
					}
					System.out.print(str[i] + " ");
				}else{
					if(str[i].equals("apple.")){
						str[i] = "peach.";
					}else if(str[i].equals("peach.")){
						str[i] = "apple.";
					}
					System.out.println(str[i]);
				}
			}
		}
	}
}
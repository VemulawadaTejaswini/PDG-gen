import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.length() > 1000) break;
			String[] words = str.split(" ");

			String longw = "";
			String mostd = "";

			int count = 0;
			int disp = 0;

			for (int i = 0; i < words.length; i++) {
				if(words[i].length() > 32) break;
				if(words[i].length() > count){
					count = words[i].length();
					longw = words[i];
				}
				for (int j = 0; j < words.length; j++) {
					if(i != j){
						if(words[i].equals(words[j]) && words[i].length() > disp){
							disp = words[i].length();
							mostd = words[i];
						}
					}
				}
			}
			System.out.println(mostd + " " + longw);

		}
	}
}
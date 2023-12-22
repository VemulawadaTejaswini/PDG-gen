import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				String str = sc.nextLine();
				String get;
				int sum = 0;
				for(int i = 0; i  < str.length();i++){
					get=String.valueOf(str.charAt(i));
					switch(get){
					case "I":
						sum+=1;
						continue;
					case "V":
						sum+=5;
						continue;
					case "X":
						sum+=10;
						continue;
					case "L":
						sum+=50;
						continue;
					case "C":
						sum+=100;
						continue;
					case "D":
						sum+=500;
						continue;
					case "M":
						sum+=1000;
						continue;
					}
				}
				System.out.println(sum);
			}
	}
}
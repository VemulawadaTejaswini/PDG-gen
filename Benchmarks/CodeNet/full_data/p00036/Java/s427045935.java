import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		String st = "";
		int f = 0;
		while(sc.hasNext()){
			if(f == 1){
				st = sc.nextLine();
			}
			f = 1;
			String[] str = new String[8];
			for(int i = 0; i < 8; i++){
				str[i] = new String(sc.nextLine());
			}
			
			for(int i = 0, k = 0; i < 8 && k == 0; i++){
				for(int j = 0; j < 8 && k == 0; j++){
					if(((str[i]).substring(j, j+1)).equals("1")){
						if(((str[i+1]).substring(j, j+1)).equals("1")){
							if(((str[i+2]).substring(j, j+1)).equals("1")){
								st = "B";
							} else if(((str[i+1]).substring(j+1, j+2)).equals("1")){
								if(((str[i]).substring(j+1, j+2)).equals("1")){
									st = "A";
								} else {
									st = "F";
								}
							} else {
								if(((str[i]).substring(j+1, j+2)).equals("1")){
									st = "G";
								} else {
									st = "D";
								}
							}
						} else {
							if(((str[i]).substring(j+2, j+3)).equals("1")){
								st = "C";
							} else {
								st = "E";
							}
						}
						k = 1;
					}
				}
			}
			System.out.println(st);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}
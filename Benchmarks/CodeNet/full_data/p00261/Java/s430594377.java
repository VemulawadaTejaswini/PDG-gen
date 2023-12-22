import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		String way,place;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			way = sc.next();
			if(way.equals("#")){
				break;
			}
			place = "A";
			
			for(int i=0;i<way.length();i++){
				if(place.equals("A")){
					if((way.charAt(i)+"").equals("0")){
						place = "X";
					}else{
						place = "Y";
					}
				}else if(place.equals("X")){
					if((way.charAt(i)+"").equals("0")){
						place = "NA";
					}else{
						place = "Z";
					}
				}else if(place.equals("Y")){
					if((way.charAt(i)+"").equals("0")){
						place = "X";
					}else{
						place = "NA";
					}
				}else if(place.equals("Z")){
					if((way.charAt(i)+"").equals("0")){
						place = "W";
					}else{
						place = "B";
					}
				}else if(place.equals("W")){
					if((way.charAt(i)+"").equals("0")){
						place = "B";
					}else{
						place = "Y";
					}
				}else if(place.equals("B")){
					if((way.charAt(i)+"").equals("0")){
						place = "Y";
					}else{
						place = "X";
					}
				}else{
					break;
				}
			}
			
			if(place.equals("B")){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		String hw;
		String end = "0 0";

		while(true){
			hw = sc.nextLine();
			if(hw.equals(end)){
				break;
			}
			list.add(hw);
		}
		for(String data: list){
			int h = Integer.parseInt(data.split(" ")[0]);
			int w = Integer.parseInt(data.split(" ")[1]);
			for(int i = 0;i < h; i++){
				for(int j = 0;j < w; j++){
					if(((j + i) % 2 == 0)){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}



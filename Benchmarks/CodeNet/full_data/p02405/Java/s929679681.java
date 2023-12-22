import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		int flag = 0;
		while(true){
			String str = br.readLine();
			if("0 0".equals(str)) break;
			list.add(str);
		}
		for(int i = 0 ; i <list.size() ; i++){
			String[] stra = list.get(i).split(" ");
			int h = Integer.parseInt(stra[0]);
			int w = Integer.parseInt(stra[1]);
			for (int j = 0 ; j < h ;j++){
				if(j%2 ==0){
					System.out.print("#");
					flag = 1;
					for(int k = flag ; k < w ; k++){
						if(k%2 == 0 ){
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					}
				}else {
					System.out.print(".");
					flag = 0;
					for(int k = flag ; k < w-1 ; k++){
						if(k%2 == 0 ){
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					}
				}

					System.out.println();
			}
			System.out.println();
		}
	}

}
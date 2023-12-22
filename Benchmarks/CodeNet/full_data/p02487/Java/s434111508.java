import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		String str;
		int height,width;

		while(true){
			str = br.readLine();

			if(str.equals("0 0")){
				break;
			}

			list.add(str);

		}

		for(int i=0;i<list.size();i++){
			System.out.println();

			height = Integer.parseInt(list.get(i).substring(0, str.indexOf(" ")));
			width = Integer.parseInt(list.get(i).substring(str.indexOf(" ")+1, str.length()));

			for(int j=0;j<height;j++){
				System.out.println();
				if(j==0 || j == height-1){
					for(int k=0;k<width;k++){
						System.out.print("#");
					}
				}else{
					for(int l=0;l<width;l++){
						if(l==0 || l==width-1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
				}
			}
		}
	}
}
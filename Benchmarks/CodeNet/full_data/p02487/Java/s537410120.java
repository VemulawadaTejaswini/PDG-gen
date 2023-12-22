import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> list = new ArrayList<String>();
		String str;
		int height,width;

		try{
			while(true){
				str = br.readLine();

				if(str.equals("0 0")){
					break;
				}

				list.add(str);

			}

			for(int i=0;i<list.size();i++){
				height = Integer.parseInt((String) list.get(i).subSequence(0, list.get(i).indexOf(" ")));
				width = Integer.parseInt((String)list.get(i).substring(list.get(i).indexOf(" ")+1,list.get(i).length()));

				for(int j=0;j<height;j++){
					for(int k=0;k<width;k++){
						if(j==0 || j==height-1 || k==0 || k==width-1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
					System.out.println();
				}
			}

			System.out.println();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
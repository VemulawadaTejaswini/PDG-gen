import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int x=0,y=0;
		for(int i=0 ;i<h ;i++){
			String[] str = br.readLine().split(" ");
			if(str[0].compareTo(str[1])>0){
				x = x + 3;
			}else if(str[0].compareTo(str[1])<0){
				y = y + 3;
			}else{
				x++;
				y++;
			}
		}
		System.out.println(x + " " + y);
	}
}
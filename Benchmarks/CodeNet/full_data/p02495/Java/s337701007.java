import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		print(2,3,false);
		while(scanner.hasNext()){
			String[] s=scanner.next().split(" ");
			int h=Integer.parseInt(s[0]);
			int w=Integer.parseInt(s[1]);
			print(h,w,scanner.hasNext());
		}
	}

	static void print(int h,int w,boolean flag){
		String[] str={"#","."};
		for(int y=0;y<h;y++){
			StringBuilder builder=new StringBuilder();
			for(int x=0;x<w;x++){
				builder.append(str[(x+y)%2]);
			}
			System.out.println(builder.toString());
		}
		if(flag)System.out.println("");
	}
}
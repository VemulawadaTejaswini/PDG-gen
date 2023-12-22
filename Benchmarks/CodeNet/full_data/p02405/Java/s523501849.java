import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder all = new StringBuilder();
		StringBuilder out = new StringBuilder();
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int loop = w / 2;
			if((h + w) <= 0){break;}
			//topLine
			for(int top=0; top < loop; top++){
				out = out.append("#.");	
			}
			if((w%2) != 0){//ｗが奇数
					out = out.append("#");
					out = out.append("\n");
					}else{out = out.append("\n");}
			
			//bodyLine
			for(int hit = 0; hit < h-1; hit++){
					for(int wid = 0; wid < w; wid++){	
						if(out.charAt(out.length() -1) == ('\n')){//一個前が改行の場合
							if(out.charAt(out.length() -2) == ('#')){//２個前の文字で判断
								out = out.append(".");
							}else{
								out = out.append("#");
							}
						}else{
							if(out.charAt(out.length() -1) == ('#')){//一個前の文字で判断
								out = out.append(".");
							}else{
								out = out.append("#");
							}
						}
					}
				out = out.append("\n");
			}
					
			//outStandby
			all = all.append(out + "\n");
			out.delete(0, out.length());
		}
		//out
		System.out.print(all);
	}
}
import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			String[] test=br.readLine().split(" ");
			int m=Integer.parseInt(test[0]);
			int f=Integer.parseInt(test[1]);
			int r=Integer.parseInt(test[2]);
			if(m==-1&&f==-1&&r==-1){
				break;
			}
			if(m==-1||f==-1){
				sb.append("F\n");
			}
			else if((m+f)>=80){
				sb.append("A\n");
			}
			else if((m+f)>=65&&(m+f)<80){
				sb.append("B\n");
			}
			else if((m+f)>=50&&(m+f)<65){
				sb.append("C\n");
			}
			else if((m+f)>=30&&(m+f)<50){
				if(r>=50){
					sb.append("C\n");
				}
				else{
					sb.append("D\n");
				}
			}
			else if((m+f)<30){
				sb.append("F\n");
			}
		}
		System.out.print(sb);
	}
}
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int h = in.nextInt(),w = in.nextInt();
			if((h|w)==0)break;
			StringBuilder ans = new StringBuilder();
			for(int i=0;i<w;i++)ans.append("#");	
			ans.append("\n");
			for(int i=0;i<h-2;i++){
				ans.append("#");
				for(int j=0;j<w-2;j++){
					ans.append(".");
				}
				ans.append("#");
				ans.append("\n");
			}
			for(int i=0;i<w;i++)ans.append("#");	
			ans.append("\n");
			System.out.println(ans.toString());
		}
	}
}
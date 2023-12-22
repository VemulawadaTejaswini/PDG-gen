import java.util.Scanner;
import java.lang.StringBuilder;

class Main{

	static String[][] strMap = {
		{null,null,null,null,null,null,null},
		{null,"a","f","k","p","u","z"},
		{null,"b","g","l","q","v","."},
		{null,"c","h","m","r","w","?"},
		{null,"d","i","n","s","x","!"},
		{null,"e","j","o","t","y"," "},
		{null,null,null,null,null,null,null},
		{null,null,null,null,null,null,null},
		{null,null,null,null,null,null,null},
		{null,null,null,null,null,null,null},
		{null,null,null,null,null,null,null}
	};


	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			String str=scan.next();
			StringBuilder build = new StringBuilder();
			String[] strs =str.split("");
			try{
				for(int i=1;i<strs.length;i+=2){			
					int a=Integer.parseInt(strs[i]);
					int b=Integer.parseInt(strs[i+1]);
					if(strMap[b][a]==null){
						System.out.println("NA");
						break;
					}
					build.append(strMap[b][a]);
					//System.out.println(strMap[b][a]);
				}
				System.out.println(build.toString());
			}catch(Exception e){
				System.out.println("NA");
			}

		}
	}

}
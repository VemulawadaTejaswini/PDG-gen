import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			String ansStr = "";
			char[] chArray = str.toCharArray();
			for(int i = 0;i < chArray.length;i++){
				if(chArray[i] == '@'){
					int a = Integer.parseInt(chArray[i+1]+"");
					String nStr = chArray[i+2] + "";
					while(a > 0){
						ansStr += nStr;
						a--;
					}
					i += 2;
				}else{
					ansStr += chArray[i] + "";
				}
			}
			System.out.println(ansStr);
		}
	}
}
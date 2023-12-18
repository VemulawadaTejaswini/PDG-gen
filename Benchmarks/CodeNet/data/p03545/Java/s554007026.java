import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		String ABCD = scan.next();
		
		/*StringBuilder sb = new StringBuilder();//+ -　連結
		sb.append(ABCD);*/
		
		int []keisancount = new int[1];//式一つのみの結果を出力するため
		keisancount[0] =0;
		
		
		tashihiki(ABCD,"+",ABCD.length(),keisancount);//今回は文字列は４
		tashihiki(ABCD,"-",ABCD.length(),keisancount);
		
		
		
		
		
	}
	
	public static int keisan (String shiki){
		int goukei = 0;
		goukei += Integer.valueOf(shiki.substring(0, 1));//最初の数字は入れておく
	
		
		for(int i = 0;i<shiki.length()-1;i++){
			if(shiki.substring(i, i+1).equals("+")){
				goukei += Integer.valueOf(shiki.substring(i+1, i+2));
				
			}else if(shiki.substring(i, i+1).equals("-")){
				goukei -= Integer.valueOf(shiki.substring(i+1, i+2));
			}
		}
		
		
		
		return goukei;
		
		
	}
	
	
	

	
	
	
	
	
	public static void tashihiki(String S,String tashihiki,int mojiretu,int[] keisancount){
		if(mojiretu ==2){
			if(tashihiki.equals("+")){
				String kekka = S.substring(0, mojiretu-1)+"+"+S.substring(mojiretu-1, S.length());
				
				//System.out.println(kekka);
				if(keisan(kekka)==7&&keisancount[0]==0){
					System.out.println(kekka+"=7");
					keisancount[0]=1;
				}
				
				
			}else if(tashihiki.equals("-")){
				String kekka2 = S.substring(0, mojiretu-1)+"-"+S.substring(mojiretu-1, S.length());
				
				//System.out.println(kekka2);
				if(keisan(kekka2)==7&&keisancount[0]==0){
					System.out.println(kekka2+"=7");
					keisancount[0]=1;
				}
				
			
				
			}
			
		}else{
			if(tashihiki.equals("+")){
				String S1 = S.substring(0, mojiretu-1)+"+"+S.substring(mojiretu-1, S.length());
				tashihiki(S1,"+",mojiretu-1,keisancount);
				tashihiki(S1,"-",mojiretu-1,keisancount);
			}else if(tashihiki.equals("-")){
				String S2 = S.substring(0, mojiretu-1)+"-"+S.substring(mojiretu-1, S.length());
				tashihiki(S2,"+",mojiretu-1,keisancount);
				tashihiki(S2,"-",mojiretu-1,keisancount);	
			}
			
			
		}
		
		
	}

}
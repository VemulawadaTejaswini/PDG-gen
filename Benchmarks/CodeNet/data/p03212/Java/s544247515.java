import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in);){
			
			int N = scan.nextInt();
			int count =0;
			
			for(int i = 1;i<=N;i++) {
				String S = ""+i+"";
				
				int shichigosan=0;
				boolean atta3 =false;
				boolean atta5 =false;
				boolean atta7 =false;
				boolean koraraigai =false;
				
				for(int j = 0;j<S.length();j++) {
					if(S.substring(j, j+1).equals("3")){
						shichigosan+=1;
						atta3 = true;
					
					}else if(S.substring(j, j+1).equals("5")){
						shichigosan+=1;
						atta5 =true;
					}else if(S.substring(j, j+1).equals("7")){
						shichigosan+=1;
						atta7=true;
						
					}else {
						koraraigai = true;
					}	
					
					
					
				}
				
				if(atta3==true&&atta5==true&&atta7==true&&koraraigai==false) {
					count +=1;
				}
				
				
				
				
			}
			
			
			
			System.out.println(count);
			
			
			
		}
		
	}

}

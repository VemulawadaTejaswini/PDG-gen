import java.util.Scanner;


class Main {



	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);
		
		while (true) {	
		String n= scanner.nextLine();
		
		if(n.equals("-")){
			break;//終了条件
		}
		int m= Integer.parseInt(scanner.nextLine());

		char[] N; 
		N=new char[n.length()];//入力された文字列Nを格納する配列
		char[] box; 
		box=new char[n.length()];
		
		for(int i=0;i<n.length();i++){
			N[i]=n.charAt(i);//各文字列をchar型の配列N[]に格納
			}

		
		for(int i=0;i<m;i++){
			int h=Integer.parseInt(scanner.nextLine());
			
			for(int ii=0;ii<n.length();ii++){
				if(h == n.length()){
					h=0;
					box[ii]=N[h];
					
					h=h+1;
				}
				else{
					box[ii]=N[h];
					h=h+1;
				}
			}
			for(int iii=0;iii<n.length();iii++){
				N[iii]=box[iii];
			}
				
			}
          for(int i=0;i<n.length();i++){
		    System.out.print(String.valueOf(N[i]));
			if(i == n.length()-1)
		    System.out.println("");
		
		}
		}


	}
}


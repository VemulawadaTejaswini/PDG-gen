import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String B = scan.next();
		
		if(A.length()>B.length()){//A,Bは正の整数なので文字列の長さは位の大きさなので判断できる
			System.out.println("GRATER");
		}else if(A.length()<B.length()){//上に同様
			System.out.println("LESS");

		}else{//A,Bの位が一致
			
			int GREATE = 0;
			int LESS = 0;
			
			for(int i = 0;i<A.length();i++){
				int A1 = Integer.parseInt(A.substring(i, i+1));
				int B1 = Integer.parseInt(B.substring(i, i+1));
				
				if(A1>B1){//この時点でA>Bでgrater
					GREATE = 1;
					break;
				}
				
				if(A1<B1){//この時点でA<BでLESS
					LESS = 1;
					break;
				}
				
				//A=Bなら同じくらいでは等しいのでしたのくらいを見て繰り返す、全ての処理が終わってもなおGRATE.LESSが０のままなら
				
			}
			
			
			if(GREATE ==1){
				System.out.println("GREATER");
			}
			
			if(LESS==1){
				System.out.println("LESS");
			}
			
			if(GREATE==0&&LESS==0){
				System.out.println("EQUAL");
			}
			
			
			
			
			
		}
		
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		if(s.indexOf("AA") != -1 || s.indexOf("KIH") == -1){//連続するAが存在するなら作れない
			System.out.println("NO");
		}
		
		s = s.replace("A" , "");//Aはあとから好きなだけ追加できるので
	
		
		if(s.equals("KIHBR")){//残るのがこれだけならば作れる
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		sc.close();
	}
	
}

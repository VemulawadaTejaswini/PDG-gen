import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mondai = sc.nextInt();
		int teisyutu = sc.nextInt();
		int seitou = 0;
		int penaruty = 0;
		String[][] kaitou = new String[teisyutu][2];
		if (teisyutu == 0){
			System.out.print(0);
			return;
		}
		for (int i = 0; i < kaitou.length; i++){
			kaitou[i][0] = sc.next();
			kaitou[i][1] = sc.next();
		}
		String clear = "null";
		for (int i = 0; i < kaitou.length; i++) {
			if (!kaitou[i][0].equals(clear)){
				if (kaitou[i][1].equals("WA")){
					penaruty++;
				}else{
					seitou++;
					clear = kaitou[i][0];
				}				
			} 
		}
		System.out.println(seitou + " " + penaruty);
	}
}
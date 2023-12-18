import java.util.Scanner;


public class Main {
	static String S;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 S = sc.next();
		sc.close();

		int[] T = new int[4];
 		for (int i = 0; i < S.length(); i++) {
		    // 配列に順番に格納する
		    T[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
		}

 		int flag = 0;

 		if(T[0]+T[1]+T[2]+T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"+"+T[1]+"+"+T[2]+"+"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]+T[1]+T[2]-T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"+"+T[1]+"+"+T[2]+"-"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]+T[1]-T[2]+T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"+"+T[1]+"-"+T[2]+"+"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]+T[1]-T[2]-T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"+"+T[1]+"-"+T[2]+"-"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]-T[1]+T[2]+T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"-"+T[1]+"+"+T[2]+"+"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]-T[1]+T[2]-T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"-"+T[1]+"+"+T[2]+"-"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]-T[1]-T[2]+T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"-"+T[1]+"-"+T[2]+"+"+T[3]+"=7");
 			flag++;
 		}
 		if(T[0]-T[1]-T[2]-T[3] == 7 && flag == 0){
 			System.out.println(T[0]+"-"+T[1]+"-"+T[2]+"-"+T[3]+"=7");
 			flag++;
 		}
	}
}
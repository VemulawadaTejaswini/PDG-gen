import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int H = sc.nextInt();
      int W = sc.nextInt();
      String[][] list = new String[H][W];
      int A = sc.nextInt();
      int B = sc.nextInt();
      if(H % (W / A) != 0 || W % (H / B) != 0){
        myout("No");
        return;
      }
      for(int i = 0; i < H; i++){
        for(int j = 0; j < W; j++){
          list[i][j] = "0";
        }
      }
      if(A == 0){//Bの数行が「1」だけ、残りが「0」だけ
        for(int i = 0; i < B; i++){
          list[i][0] = "1";
        }
      }else if(B == 0){//Aの数列が「1」だけ、残りが「0」だけ
        for(int i = 0; i < A; i++){
          list[0][i] = "1";
        }
      }else{
        
      }
      
      String output = "";
      for(int i = 0; i < H; i++){
        String tmp = "";
        for(int j = 0; j < W; j++){
          tmp += list[i][j];
        }
        if(i != H - 1){
        	output += tmp + "\n";
        }else{
          output += tmp;
        }
      }
      
      myout(output);
	}
}


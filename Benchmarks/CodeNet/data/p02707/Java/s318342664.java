import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int syaink = sc.nextInt();
      int[] buka=new int[syaink];
      for(int i=0;i<buka.length;i++){
        buka[i]=0;
      }
      for(int i=0;i<syaink-2;i++){
        int a=sc.nextInt();
        buka[a]+=1;
      }
      for(int i=0;i<buka.length;i++){
        println(buka[i]);
      }
	}
}
import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
      String s[] = new String[N];//sの中でN回まわしていく
      for(int i=0; i<N; i++){
          s[i] =sc.next();//入力されるsが入る箱
      }
      Arrays.sort(s);//ソートを使い入力したNを並び替えていく
        int a =1;
        for(int j=0; j<N-1; j++){
            if(!s[j].equals(s[j+1])){//ソートで並び替えたことにより配列で順番ずつ文字列を比較することができる
                                     //apple[0]==apple[1],apple[1]==orange[2]
              a++;//異なった文字列はカウントしていく
            }
        }
        System.out.println(a);
      }
}
     
      
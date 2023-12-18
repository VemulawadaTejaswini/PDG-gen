import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      		int a = sc.nextInt();


      int[] ary=new int[a];
      for (int i=0; i < a;i++){
        ary[i]=sc.nextInt();
      }
	int ans=0;      
      boolean flg=false;
      for (int i=0; i < a;i++){
        flg=false;
        int taget=ary[i];
        for (int j=0;j<i;j++){
          if (taget>ary[j]){
            flg=true;
            break;
          }
        }
        if(!flg){
          ans++;
        }
      }
		System.out.println(ans);
	}
}
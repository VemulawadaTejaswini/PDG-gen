import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      int[] hairetu=new int[b];
        for(int i=0;i<hairetu.length;i++){
          int c=sc.nextInt();
          hairetu[i]=c;
        }
      int count=0;
      for(int k=0;k<hairetu.length;k++){
        int flag=0;
        for(int j=0;j<k;j++){
          if(hairetu[k]>hairetu[j]){
            flag=1;
            break;
          }
        }
        if(flag==0){
          count++;
        }
      }
      System.out.println(count);
	}
}
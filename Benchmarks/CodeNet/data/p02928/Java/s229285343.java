import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int arraynumber = sc.nextInt();
      int kurikaeshi = sc.nextInt();
      int kurikaeshizouka = 0;
      for(int i=1;i<=kurikaeshi;i++){
        kurikaeshizouka += i;
      }
      System.out.println(kurikaeshizouka);
		// スペース区切りの整数の入力
      int numarray[] = new int[arraynumber];
      for(int i=0;i<arraynumber;i++){
         numarray[i] = sc.nextInt();
      }
      //カウンター
		long count = 0;
	// 文字列の入力
		//String s = sc.next();
    
      //本処理
     for(int i=0;i<arraynumber;i++){
       for(int j=0;j<arraynumber;j++){
       	if(numarray[i]>numarray[j]){
          System.out.println(numarray[i]+"> "+numarray[j]+" "+count);
        count++;
    	}
       }
     }
      System.out.println(count);
     count = count*kurikaeshizouka;
      System.out.println(count);
      count=count%(1000000000+7);
      
		// 出力
		//System.out.println(Month+" "+Day+" "+Dayten+" "+Dayone+" "+count);
      System.out.println(count);
	}
}
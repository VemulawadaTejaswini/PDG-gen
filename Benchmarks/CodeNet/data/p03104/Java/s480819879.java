import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力(AとB)
		long A = sc.nextLong();
		long B = sc.nextLong();
      	long partA =0;
      	long partB =0;
      	long a = A-1;
      	// A-1=aの偶奇を判別
      if((a)%2==1){
        if(((a-1)/2)%2==0){
          partA=0;
        }else{
          partA=1;
        }
      }else{
        if(((a)/2)%2==0){
          partA=0^a
        }else{
          partA=1^(a)
        }
      }
      
      if((B)%2==1){
        if(((B-1)/2)%2==0){
          partB=0;
        }else{
          partB=1;
        }
      }else{
        if(((B)/2)%2==0){
          partB=0^B
        }else{
          partB=1^(B)
        }
      }  　
      	long answer =partA^partB;
        }
		System.out.println(answer);
	}
}
 
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        
      int[] A;
      A=new int[N];
        
        for (int i=0;i<N;i++){
          A[i]=sc.nextInt();
        }
      
        int SUM=0;
        int XOR=0;
        int count=0;
      
        for (int i=0;i<N;i++){
          SUM=0;
          XOR=0;
          for (int j=i;j<N;j++){
            SUM=SUM+A[j];
            XOR=XOR^A[j];
            
            if (SUM==XOR){
              count+=1;
            }else{break;}
          }
        }
            
		System.out.println(count);
	}
}
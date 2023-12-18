import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
        
      	int n[] = new int[N];
      	
      	for(int i=0; i<N; i++){//N番目に住んでいる住人
            n[i] =sc.nextInt();
      	} 
      
      	int th = 0;//住人たちの体力の総和
      	int pp[] = new int[101];
      	for(int p=1; p<=100; p++){//集会のP座標をまわす
           th = 0;
        for(int i=0; i<N; i++){//N番目に住んでいる住人
         	int h =(n[i]-p)*(n[i]-p);//住人が集会P座標に向かうのにいる体力
         	th +=h;//住人に必要な体力を足していく
          	pp[p] = th;//thにpp[p]を入れることで100個のthが用意される
      	}
        }
      	  int min = pp[1];
          for(int m=2; m<pp.length; m++){
          if(min>pp[m]){
          min = pp[m];
          }
          }
          System.out.println(min); 
    }
}
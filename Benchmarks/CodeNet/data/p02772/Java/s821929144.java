import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int num[] = new int[N];
      	boolean flag = true;
      	for(int i=0;i<N;i++){
          num[i] = sc.nextInt();
          if(num[i]%2 ==0){
            if((num[i]%3 != 0)&&(num[i]%5 != 0)){
              flag = false;
              System.out.println("DENIED");
              break;
            }
          }
          
        }
       if(flag==true){
       	System.out.println("APPROVED");
       }
    }
		
    }
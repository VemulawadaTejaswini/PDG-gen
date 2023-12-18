import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
     	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	int e = sc.nextInt();
        int order[] = {a,b,c,d,e};
      	Integer time[] = new Integer[order.length];
      	int total = 0;
      
      	//時間の1の位求める
      	for(int i = 0; i < order.length; ++i){
        	time[i] = order[i]%10;
          	order[i] = order[i]-time[i];
        }
      	
      	//時間を足す
      	for(int i = 0; i < time.length; ++i){
          int amari=0;
          	if(time[i]!=0){
          		amari = 10-time[i];
            }
          	total = total+order[i]+time[i]+amari;
        }
      	//最後の時間に余りを引く
      	Arrays.sort(time);
      	for(int i = 0; i < 5; ++i){
      		if(time[i]!=0){
      			total = total - (10-time[i]);
          		 //調理時間出力
        	}
     	}
      
      System.out.println(total);
      
    }
}
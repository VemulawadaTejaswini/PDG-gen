import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan = new Scanner(System.in);
	int X = scan.nextInt();
    int sum =0;
    int d =0;
    int l =0;
    int g =0;
    for(int i=0;i<=X;i++){
    	sum += i;
		if(X-sum>i){
			d = X-sum;
		}else{
			break;
		}
    }
    for(int f =X; f>=1 ; f--){
    	sum=0;
    	for(int i=0;i<=X-f;i++){
        	sum += i;
    		if(X-f-sum>i){
    			l = X-f-sum;
    		}else{
    			break;
    		}
    }
    	if(f>l){
    		g =f;
    	}else{
    		break;
    	}
 }
    if(g<d){
 	   d=g;
    }
    System.out.println(d);
}
}
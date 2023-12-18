import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    int y = sc.nextInt(); 
     if(x<0||y<0||(y+x)%3!=0) System.out.println(0);
else if(x>=y){
 int k = x - y;
  int t = (y - k)/3;
    
  System.out.println(C(2*t+k,t,100000007));
}
   else{
 int k = y - x;
  int t = (x - k)/3;
    
  System.out.println(C(2*t+k,t,100000007));

}

 }
public static long C(int n, int r, int p)
{
	long ret = 1;
	while(true){
		if(r == 0)break;
		int N = n % p;
		int R = r % p;
		if(N < R)return 0;
 
		for(int i = 0;i < R;i++){
			ret = ret * (N-i) % p;
		}
		long imul = 1;
		for(int i = 0;i < R;i++){
			imul = imul * (i+1) % p;
		}
		ret = ret * Modulo.inv(imul, p) % p;
		n /= p; r /= p;
	}
	return ret;
}
}
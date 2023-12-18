import java.util.Scanner;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    
    int[] firstDice = new int[n];
    
    for(int i=1;i<=n;i++){
      firstDice[i-1] = getExp(2,i,k);
    }
    int maxExp = firstDice[0];
    long upsum = 0;
    long downsum = pow(2,firstDice[0])*n;
    
    for(int i=0;i<n;i++){
      upsum+=pow(2,maxExp-firstDice[i]);
    }
    double answer = (double)upsum/downsum;
    
    System.out.print(answer);
    
    System.out.flush();
  }
  
  public static int getExp(int base , int first , int target){
    int exp = 1;
    int cnt = 0;
    while(first*exp<target){
      cnt++;
      exp*=base;
    }
    return cnt;
  }
  //x^n
  public static long pow(int x, int n){
    long ans = 1;
    while (n > 0) {
		if ((n & 1) == 1) {
			ans = ans * x;
		}
		x = x * x; 
		n >>= 1;
	}
	return ans;
  }
}
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m;
    m = 0;
    n = sc.nextInt();
    int v[] = new int[n];
    for(int i=0;i<n;i++){
    	v[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
    	if(0 > v[i]||v[i]>(-1)*v[i+1]){
    		v[i]*=-1;
    		v[i+1]*=-1;
    	}
    	m += v[i];
    }
    m += v[n-1];
    System.out.println(m);
  }
}

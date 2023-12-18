import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0,m = 0;
    int n = sc.nextInt();
    int v[] = new int[n];
    for(i=0;i<n;i++){
    	v[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++){
    	if(0 > v[i]||v[i]>(-1)*v[i+1]){
    		v[i]*=-1;
    		v[i+1]*=-1;
    	}
    	m += v[i];
    }
    System.out.println(m+v[n-1]);
  }
}

import java.util.Scanner;

class Sample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	int n = sc.nextInt();
      
      	for(int i = 0; i < n; i++){
          a += b;
          c += d;
        }
      	if(a < c){
          System.out.println("YES");
        }else{
		  System.out.println("NO");
        }
    }
}
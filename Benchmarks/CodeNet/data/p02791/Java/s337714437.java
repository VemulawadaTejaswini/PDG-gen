import java.util.*;    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      int p[]=new int [n];
      for(int i=0;i<n;i++){
		p[i] = sc.nextInt();
      }
      int count=0;
      for(int i=0;i<n;i++){
        int count2=0;
        for(int j=0;j<=i;j++){
        if(p[i]>p[j]){
          break;
        }
          count2++;
      }
        if(count2==i+1){
          count++;
        }
      }
		System.out.print(count);
	}
}
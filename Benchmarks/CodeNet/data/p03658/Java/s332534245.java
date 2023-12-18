import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),sum=0;
    int[] l=new int[n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    Arrays.sort(l);
    for(int i=1;i<=k;i++){
      sum+=l[n-i];
    }
    System.out.println(sum);
  }
}

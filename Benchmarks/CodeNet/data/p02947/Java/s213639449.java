import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    String s[] = new String[N];
    
    sc.nextLine();
    for(int i=0; i<N; i++){
    	s[i] = sc.nextLine();
    }
    
    int numStr = 10;
    long sumCnt = 0;
    for(int i=0; i<N-1; i++){
      String[] str_si = s[i].split("");
      Arrays.sort(str_si);
      for(int j=i+1; j<N; j++){
        String[] str_sj = s[j].split("");
        Arrays.sort(str_sj);
        if(Arrays.equals(str_si,str_sj))
          sumCnt++;
      }
    }
    System.out.println(sumCnt);
  }
}
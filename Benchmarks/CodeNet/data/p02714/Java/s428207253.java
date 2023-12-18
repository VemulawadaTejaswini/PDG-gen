import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
        String RGB = sc.next();
        long cnt = (long) 0;

      	for(int i=0; i<N-2;  i++){
          char ci = RGB.charAt(i);
          for(int j=i+1; j<N-1;  j++){
            char cj = RGB.charAt(j);
            if(ci==cj){
              continue;
            }
            for(int k=j+1; k<N;  k++){
              char ck = RGB.charAt(k);
              if((cj==ck)||(ci==ck)){
                continue;
              }
              if((k-j)!=(j-i)){
                 cnt++;
              }
            }
          }
        }
      
      	System.out.println(cnt);
        return;
	}
}

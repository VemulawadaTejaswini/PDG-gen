import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N < 20){
        	System.out.println(0);
        	return;
        }
      	int Ncnt = 0;
      	for(int i = 1; i < N; i+=2){
          	Integer hN = (int) Math.floor(N/2);
        	for(int j = 1; j < hN; j++){
              	if(i%j==0){
                	cnt++;
                }
            }
          	if(cnt==8){
              Ncnt++;
            }
        }
		System.out.println(Ncnt);
	}
}

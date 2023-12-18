import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int A = sc.nextInt();
      	int B = sc.nextInt();
     	int C = sc.nextInt();
        Integer[] Aa = new Integer[A];
      	for(int i = 0; i < A; i++){
        	Aa[i] = sc.nextInt();
        }
      	Integer[] Ba = new Integer[B];
      	for(int i = 0; i < B; i++){
        	Ba[i] = sc.nextInt();
        }
      	Integer[] Ca = new Integer[C];
      	for(int i = 0; i < C; i++){
        	Ca[i] = sc.nextInt();
        }
      	Arrays.sort(Aa, Collections.reverseOrder());
      	Arrays.sort(Ba, Collections.reverseOrder());
      	Arrays.sort(Ca, Collections.reverseOrder());
		Integer sum = 0;
      	while(X>0){
          	if(Aa[0] >= Ca[0]){
              	sum += Aa[0];
              	Aa[0] = 0;
              	Arrays.sort(Aa, Collections.reverseOrder());
            }else if(Ca[0] == 0){
              	sum += Aa[0];
              	Aa[0] = 0;
              	Arrays.sort(Aa, Collections.reverseOrder());
            }else{
            	sum += Ca[0];
              	Ca[0] = 0;
              	Arrays.sort(Ca, Collections.reverseOrder());
            }
        	X--;
        }
      	while(Y>0){
        	if(Ba[0] >= Ca[0]){
              	sum += Ba[0];
              	Ba[0] = 0;
              	Arrays.sort(Ba, Collections.reverseOrder());
            }else if(Ca[0] == 0){
              	sum += Ba[0];
              	Ba[0] = 0;
              	Arrays.sort(Ba, Collections.reverseOrder());
            }else{
            	sum += Ca[0];
              	Ca[0] = 0;
              	Arrays.sort(Ca, Collections.reverseOrder());
            }
        	Y--;
        }
      
		System.out.println(sum);
	}
}
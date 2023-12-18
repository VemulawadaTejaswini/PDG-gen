import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int N = sc.nextInt();
      	int[] number = new int[N];
      	int count = 0;
      	int max = 0; 
		for(int i = 0;i<N;i++){
          	number[i] = sc.nextInt();
        }
      
      	for(int i = 0; i <N;i++){
          	count = 0;
          	for(int j = i;j<N-1;j++){
              	if(number[j] >= number[j+1]){
                  	count++;
                }else{
                  	break;
                }
            }
           	if(max <= count){
              	max = count;
            }
        }
      
        System.out.println(max);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] height = new int[N];
        int count = 0;
        
        for(int i=0; i<N; i++){
          height[i] = sc.nextInt();
        }
      
      	for(int j=0; j<N-1; j++){
            for(int k=j+1; k<N; k++){
              if((height[j]+height[k]) == Math.abs((j+1)-(k+1))){
                count++;
              }
            }
        }
        System.out.println(count);
    }
}

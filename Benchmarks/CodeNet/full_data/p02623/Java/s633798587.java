import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int num1 = sc.nextInt();
      	int num2 = sc.nextInt();
      	int lim = sc.nextInt();
      
      	int[] n1 = new int[num1];
      	int[] n2 = new int[num2];
      	int ans = 0, tmp1 = 0, tmp2 = 0;
      
      	for(int i = 0; i < num1 ; i++){
      		n1[i] = sc.nextInt();
          	tmp1 += n1[i];
          	if(tmp1 <= lim){
              ans++;
            }
      	}
      	for(int j = 0; j < num2 ; j++){
      		n2[j] = sc.nextInt();
          	tmp2 += n2[j];
          	if(tmp2 <= lim){
              ans++;
            }
        }
      System.out.println(ans);
    }
}
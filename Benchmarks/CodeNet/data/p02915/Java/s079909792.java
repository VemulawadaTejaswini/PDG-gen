import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      	int length = sc.nextInt();
      	int a[] = new int[length];
  		int b[] = new int[length - 1];
      	int a_sum = 0;
      
     	for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();
      
      	a[0] = b[0];
      	a[1] = b[0];      
      	
      	for(int i = 2;i < length; i++){
        	if(a[i - 1] > b[i - 1]) a[i] = a[i -1];
            else a[i] = b[i - 1];
        }
      
      	for(int num: a) a_sum += num;
     
        System.out.println(a_sum);
        
	}
}

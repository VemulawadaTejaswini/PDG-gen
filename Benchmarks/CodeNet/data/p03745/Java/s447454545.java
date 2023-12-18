import java.util.Scanner;
public class Main{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int count =0;
		int prev = arr[0];
		boolean flag = true;
		int i=1;
		
		while(i<n){
			if(arr[i] > prev){
				flag = true;
				prev = arr[i];
			}else if(arr[i] < prev){
				flag = false;
				prev = arr[i];	
			}else{
				i++;
				continue;
			}
			i++;
			count++;
		
			for( ;i<n; i++){
				if(flag == true){
					if(arr[i] >= prev)
						prev =  arr[i];
					else{
						prev = arr[i];
						i++;
						break;
					}
				}else{
					if(arr[i] <= prev)
						prev =  arr[i];
					else{
						prev = arr[i];
						i++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
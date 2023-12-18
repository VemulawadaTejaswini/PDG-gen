import java.util.*;
class Main {
	Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
  	int[] arr = new int[n];
    int max = 0;
  	int sec = 0;
  	for(int i=0;i<n;i++) {
    	arr[i] = sc.nextInt();
    	if(arr[i] > max) {
        	sec = max;
          	max = arr[i];
        }
      	else if(arr[i] > sec){
      		sec = arr[i];
      	}
    }
  	for(int i=0;i<n;i++) {
    	if(a[i] == max) {
        	System.out.println(sec);
        }
      	else System.out.println(max);
    }
}

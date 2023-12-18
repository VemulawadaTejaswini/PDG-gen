import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N;
  	N = sc.nextInt();
  	if(N==0) System.exit(0);

  	int[] a = new int[N];
  	for (int i=0;i<N;i++){
		a[i] = sc.nextInt();
	}
  	
  	for (int j=0;j<N;j++){
      	if(a[j]%2 == 0){
          	//System.out.println("a["+j+"]="+a[j]);
          	if((a[j]%3!=0)&&(a[j]%5!=0)){
              	System.out.println("DENIED");
              	System.exit(0);
            }
        }
    }

  	System.out.println("APPROVED");
	
  	System.exit(0);
	}
}
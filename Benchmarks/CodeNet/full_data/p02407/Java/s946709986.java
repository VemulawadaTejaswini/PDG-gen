import java.util.*;

class Main{
	Scanner scan = new Scanner(System.in);
	int n;
	int i;
	int j;
	public Main(){
		n = scan.nextInt();
		int[] a=new int[n];
		for(i=0; i<n; i++){
			a[i]=scan.nextInt();
		}
		int[] b=new int[n];
		i = 0;
		for(j=n-1;j>=0;j--){
			b[i]=a[j];
			i++;
		}
		for(i=0;i<n;i++){
			System.out.print(b[i]);
                        if(i==n-1){
                            System.out.println("");
                            break;
                        }else{
			    System.out.print(" ");
		        }
	        }
        }
	public static void main(String[] args){
		new Main();
	}
}
import java.util.Scanner;
class Main {

	public static void printArray(int[] a,int n){
    	for(int f=0;f<n;f++){
    		if(f<n-1)System.out.print(a[f]+" ");
    		else System.out.println(a[f]);
    	}
	}

	public static void scanArray(int[] a,int n, Scanner s){
    	for(int i=0;i<n;i++){
    		a[i] = s.nextInt();
    	}
	}

	public static void insertSort(int[] a,int n){
		int v,j;
    	for(int i=1;i<n;i++){
    		v=a[i];
    		j=i-1;
    		while(j>=0 && a[j]>v){
    			a[j+1]=a[j];
    			j--;
    		}
    		a[j+1]=v;

    		printArray(a,n);
    	}
	}

	public static void bubbleSort(int[] a,int n){
		int f = 1;
		int c = 0;
		int tmp;
		while(f==1){
			f=0;
			for(int j=n-1;j>=1;j--){
				if(a[j]<a[j-1]){
					c+=1;
					tmp=a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
					f=1;
				}
			}
		}
		printArray(a,n);
		System.out.println(c);
	}

	public static void selectionSort(int[] a,int n){
		int minj;
		int tmp;
		int c=0;
		for(int i=0;i<n;i++){
			minj=i;
			for(int j=i;j<n;j++){
				if(a[j]<a[minj]){
					minj=j;
				}
			}
			if(minj!=i)c+=1;{
				tmp=a[i];
				a[i]=a[minj];
				a[minj]=tmp;
			}
		}
		printArray(a,n);
		System.out.println(c);
	}

	public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int a[] = new int[n];

    	scanArray(a,n,scan);
    	//printArray(a,n);
    	//insertSort(a,n);
    	//bubbleSort(a,n);
    	selectionSort(a,n);


    }
}
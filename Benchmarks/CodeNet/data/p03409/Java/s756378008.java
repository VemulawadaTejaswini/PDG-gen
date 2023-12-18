import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();
	int[] a = new int[N];
	int[] b = new int[N];
	int[] c = new int[N];
	int[] d = new int[N];

	for(int i = 0; i < N; i++){
	    a[i] = scan.nextInt();
	    b[i] = scan.nextInt();
	}
	for(int i = 0; i < N; i++){
	    c[i] = scan.nextInt();
	    d[i] = scan.nextInt();
	}

	Sort s1 = new Sort();
	s1.method(a,b,N);
	//	b = sort(b,N);
	Sort s2 = new Sort();
	s2.method(c,d,N);
	//	d = sort(d,N);

	int count = 0;
	for(int i = 0; i < N; i++){
	    if(s1.value.ary1[i] < s2.value.ary1[i]){
		for(int j = i; j < N; j++){
		    if(s1.value.ary2[j] < s2.value.ary2[j]){
			count++;
			break;
		    }
		}
	    }
	}
	
	System.out.println(count);
    }
}

class ReturnArray{
    public int[] ary1;
    public int[] ary2;
    ReturnArray(int N){
	
	ary1 = new int[N];
	ary2 = new int[N];
    }
}

class Sort{
    ReturnArray value;

    public ReturnArray method(int[] array1, int[] array2, int N){
	value = new ReturnArray(N);
	for(int i = 0; i < N-1; i++){
	    for(int j = i+1; j < N; j++){
		if(array1[i] > array1[j]){
		    int tmp1 = array1[i];
		    array1[i] = array1[j];
		    array1[j] = tmp1;
		    int tmp2 = array2[i];
		    array2[i] = tmp2;
		}
	    }
	}
	
	for(int i = 0; i < N; i++){
	    value.ary1[i] = array1[i];
	    value.ary2[i] = array2[i];
	}
	
	return value;
    }
}
    

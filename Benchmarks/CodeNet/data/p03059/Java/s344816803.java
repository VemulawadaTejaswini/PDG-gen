import java.util.*;

public class biscuit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.next());
        int n2 = Integer.parseInt(sc.next());
        int n3 = Integer.parseInt(sc.next());

	int[] array= new int[n3];
	
	for(int i=0;i<n3;i++){
	    array[i] = 0;
	}

	int m = n3/n1;
	for(int i=1; i<=m; i++){
	    int mm = n1*i;
	    array[mm] = n2;
	}
        
	int count=0;
	for(int j=0; j<n3; j++)
	    count += array[j];

	System.out.println(count);
    }
}

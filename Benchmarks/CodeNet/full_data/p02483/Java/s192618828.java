import java.util.*;

public class Main{
    public static void main(String[] args){
	int i, j, k;
	int[] data = new int[3];
	Scanner sc = new Scanner(System.in);
	for(i=0; i<data.length; i++)
	    data[i] = sc.nextInt();

	for(i=data.length-1; i>1; i--)
	    for(j=0; j<i; j++)
		if(data[j]>data[j+1]){
		    k = data[j];
		    data[j] = data[j+1];
		    data[j+1] = k;
		}
	for(i=0; i<data.length; i++)
	    System.out.print(data[i] + " ");
    }
}
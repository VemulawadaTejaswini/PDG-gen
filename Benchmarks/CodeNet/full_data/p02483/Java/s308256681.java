import java.util.Scanner;

public class Main{
	public static void main(String args){
	Scanner sc = new Scanner(System.In);
	int[] a=sc.nextInt();
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0; j < data.length-i-1; j++) {
            		if(data[j] > data[j+1]) {
            			int asc = data[j];
            			data[j] = data[j+1];
            			data[j+1] = asc;
			}
		}
	}
	for(int i = 0; i < data.length; i++) {
        	System.out.print(data[i]+" ");
        }
    }
}